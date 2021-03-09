package sparkmasterworker.worker

import java.util.UUID

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import sparkmasterworker.common.{HearBeat, RegisterWorkerInfo, RegisteredWorkerInfo, SendHeartBeat}

import scala.concurrent.duration.DurationInt

/**
 * @author yuhang.sun
 * @date 2021/3/9 - 23:43
 * @version 1.0
 * @Description
 */
class SparkWorker(masterHost: String, masterPort: Int, masterName: String) extends Actor {
  //masterProxy是Master的代理/引用Ref
  var masterProxy: ActorSelection = _
  val id: String = UUID.randomUUID().toString

  override def preStart(): Unit = {
    //初始化masterProxy
    masterProxy = context.actorSelection(s"akka.tcp://SparkMaster@${masterHost}:${masterPort}/user/${masterName}")
  }

  override def receive: Receive = {
    case "start" => println("worker启动了...")
      //发送一个注册消息
      masterProxy ! RegisterWorkerInfo(id, 16, 16 * 1024)
    case RegisteredWorkerInfo => println("workid=" + id + "注册成功~")
      //当注册成功后，就定一个定时器，每隔一定时间，发送SendHeartBeat给自己
      import context.dispatcher
      //说明
      //1.0 millis 不延时，立即执行定时器
      //2.3000 millis 表示每隔3秒执行依次
      //3.self：表示发给自己
      //4.SendHeartBeat 发送的内容
      context.system.scheduler.schedule(0 millis, 3000 millis, self, SendHeartBeat)
    case SendHeartBeat =>
      println("worker=" + id + "给Master发送心跳")
      masterProxy ! HearBeat(id)

  }
}

object SparkWorker {
  def main(args: Array[String]): Unit = {
    if (args.length != 6) {
      println("请输入参数 workerHost workerPort workerName masterHost masterPort masterName")
      sys.exit()
    }

    val workHost = args(0)
    val workPort = args(1)
    val workerName = args(2)
    val masterHost = args(3)
    val masterPort = args(4)
    val masterName = args(5)
    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=${workHost}
         |akka.remote.netty.tcp.port=${workPort}
            """.stripMargin)
    //创建ActorSystem
    val sparkWorkerSystem = ActorSystem("SparkWorker", config)

    //创建SparkWorker的引用/代理
    val sparkWorkerRef = sparkWorkerSystem.actorOf(Props(new SparkWorker(masterHost, masterPort.toInt, masterName)), workerName)

    //启动actor
    sparkWorkerRef ! "start"
  }
}

package yellowchicken.client

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import yellowchicken.common.{ClientMessage, ServerMessage}

import scala.io.StdIn

/**
 * @author yuhang.sun
 * @date 2021/3/9 - 22:22
 * @version 1.0
 * @Description
 */
class CustomerActor(serverHost: String, serverPort: Int) extends Actor {
  //定义一个YellowChickenServerRef
  var serverActorRef: ActorSelection = _

  //在Actor中有一个方法PreStart方法，他会在actor运行前执行
  //在akka的开发中，通常将初始化的工作，放在方法中preStart方法
  override def preStart(): Unit = {
    println("preStart开始执行")
    this.serverActorRef =
      context.actorSelection(s"akka.tcp://Server@${serverHost}:${serverPort}/user/YellowChickenServer")
    println("this.serverActorRefer=" + this.serverActorRef)
  }

  override def receive: Receive = {
    case "start" => println("start 客户端运行，可以咨询问题")
    case msg: String =>
      //发送给小黄鸡客服
      serverActorRef ! ClientMessage(msg) //使用ClientMessage case class apply
      //如果接收到服务器端的回复
    case ServerMessage(msg) => println("收到小黄鸡客服的回复:" + msg)
  }
}

//主程序-入口
object CustomerActor extends App {
  val (clientHost, clientPort, serverHost, serverPort) = ("127.0.0.1", 9990, "127.0.0.1", 9999)
  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$clientHost
       |akka.remote.netty.tcp.port=$clientPort
        """.stripMargin)
  //创建ActorSystem
  private val clientSystem: ActorSystem = ActorSystem("Server", config)
  //创建CustomerActor的实例和引用
  private val customerActorRef: ActorRef = clientSystem.actorOf(Props(new CustomerActor(serverHost, serverPort)), "CustomerActor")

  //启动customerRef/也可以理解为启动Actor
  customerActorRef ! "start"

  //客户端可以发送消息给服务器
  while (true) {
    println("请输入要咨询的问题")
    val msg = StdIn.readLine()
    customerActorRef ! msg
  }
}

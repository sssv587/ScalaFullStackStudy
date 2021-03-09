package yellowchicken.server

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import yellowchicken.common.{ClientMessage, ServerMessage}

/**
 * @author yuhang.sun
 * @date 2021/3/9 - 22:10
 * @version 1.0
 * @Description
 */
class YellowChickenServer extends Actor {
  override def receive: Receive = {
    case "start" => println("start 小黄鸡客服开始工作了...")
    //如果接收到ClientMessage
    case ClientMessage(msg) => msg match {
      //使用match-case 匹配(模糊)
      case "大数据学费" => sender() ! ServerMessage("35000RMB")
      case "学校地址" => sender() ! ServerMessage("北京昌平xx路xx大厦")
      case "学习什么技术" => sender() ! ServerMessage("大数据 前端 python")
      case _ => sender() ! ServerMessage("你说的啥子~")
    }
  }
}

//主程序-入口
object YellowChickenServer extends App {

  val host = "127.0.0.1" //服务端ip地址
  val port = 9999
  //创建config对象,指定协议类型，监听的ip和端口
  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$host
       |akka.remote.netty.tcp.port=$port
        """.stripMargin)

  //创建ActorSystem
  //url(统一资源定位)
  val serverActorSystem: ActorSystem = ActorSystem("Server", config)
  //创建YellowChickenServer的actor和返回actorRef
  private val yellowChickenServerRef: ActorRef = serverActorSystem.actorOf(Props[YellowChickenServer], "YellowChickenServer")

  //启动
  yellowChickenServerRef ! "start"
}

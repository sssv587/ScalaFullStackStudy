package actors

import akka.actor.Actor

/**
 * @author yuhang.sun
 * @date 2021/3/8 - 1:03
 * @version 1.0
 * @Description
 */
class BActor extends Actor{
  override def receive: Receive = {
    case "我打" =>
      println("Actor(乔峰): 挺猛的  看我降龙十八掌~ ")
      //Thread.sleep(100)
      //通过sender() 可以获取到发送消息的Actor的ref
      sender() ! "我打"
    case "别打了" =>
      sender() ! "好"
  }
}

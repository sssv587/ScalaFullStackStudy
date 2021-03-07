package actors

import akka.actor.{Actor, ActorRef}

/**
 * @author yuhang.sun
 * @date 2021/3/8 - 1:03
 * @version 1.0
 * @Description
 */
class AActor(actorRef: ActorRef) extends Actor {
  val bActorRef: ActorRef = actorRef
  var count = 1

  override def receive: Receive = {
    case "start" => println("AActor 出招了， start ok")
      self ! "我打" //发给自己
    case "我打" =>
      //给BActor 发出消息
      //这里需要持有BActor的引用(BActorRef)
      println(s"AActor(黄飞鸿) 厉害 看我佛山无影脚~~~~ 第${count}脚")
      count += 1
      if (count == 101) {
        bActorRef ! "别打了"
      } else { //Thread.sleep(100)
        bActorRef ! "我打"
      } //发给了BActor}

    case "好"
    => context.stop(self) //停止当前ActorRef
      context.system.terminate() //退出ActorRef
  }
}

package com.futurebytedance.akka.actors

import akka.actor.ActorSystem
import akka.actor.Props

/**
 * @author yuhang.sun
 * @date 2021/3/8 - 1:03
 * @version 1.0
 * @Description
 */
object ActorGame {
  def main(args: Array[String]): Unit = {
    //创建ActorSystem
    val actorFactory = ActorSystem("actorFactory")
    //先创建BActor引用/代理
    val bActorRef = actorFactory.actorOf(Props[BActor], "bActor")
    //创建AActor的引用
    val aActorRef = actorFactory.actorOf(Props(new AActor(bActorRef)), "aActor")

    //aActor出招
    aActorRef ! "我打"
  }
}

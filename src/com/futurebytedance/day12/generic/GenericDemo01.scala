package com.futurebytedance.day12.generic

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 0:34
 * @version 1.0
 * @Description 泛型
 */
object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage[Int](10)
    println(intMessage)
    val strMessage = new StringMessage[String]("hello")
    println(strMessage)
  }
}

/*
编写一个Message类
可以构建Int类型的Message,String类型的Message.
要求使用泛型来完成设计,(说明：不能使用Any)
*/
abstract class Message[T](s: T) {
  def get: T = s
}

class IntMessage[Int](value: Int) extends Message {}

class StringMessage[String](value: String) extends Message {}

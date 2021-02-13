package com.futurebytedance.day02.datatype

/**
 * @author yuhang.sun
 * @date 2021/2/13 - 23:06
 * @version 1.0
 * @Description
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    //因为Int是一个类，因此他的一个实例，就是可以使用很多方法
    //在scala中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" + num1.toString + "\t" + 100.toDouble)

    sayHi()
    sayHi
  }

  def sayHi(): Unit = {
    println("say hi")
  }
}

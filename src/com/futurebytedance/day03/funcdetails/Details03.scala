package com.futurebytedance.day03.funcdetails

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 23:13
 * @version 1.0
 * @Description
 */
object Details03 {
  def main(args: Array[String]): Unit = {


    def f1(): Unit = { //ok private final
      println("f1")
    }

    println("ok~~")

    def sayOK(): Unit = { //private final sayOk$1
      println("main sayOk")
      def sayOK():Unit = {
        println("sayok sayok") //private final sayOk$2
      }
    }
  }

  def sayOk(): Unit = { //成员
    println("main sayOk")
  }
}

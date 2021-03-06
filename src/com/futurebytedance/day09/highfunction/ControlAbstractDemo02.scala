package com.futurebytedance.day09.highfunction

import scala.annotation.tailrec

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 2:04
 * @version 1.0
 * @Description 控制抽象
 */
object ControlAbstractDemo02 {
  def main(args: Array[String]): Unit = {
    var x = 10

    while (x > 0) {
      x -= 1
      println("x=" + x)
    }

    x = 10
    println("-------------------------------------------------")

    @tailrec
    def until(condition: => Boolean)(block: => Unit): Unit = {
      //类似while循环，递归
      if (condition) {
        block
        until(condition)(block)
      }
      //      println("x=" + x)
      //      println(condition)
      //      block
      //      println("x=" + x)
    }

    until(x > 0) {
      x -= 1
      println("x=" + x)
    }

  }
}

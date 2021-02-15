package com.futurebytedance.day03.exercise

import scala.io.StdIn

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 3:00
 * @version 1.0
 * @Description
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入数字(1-9)之间")
    val n = StdIn.readInt()
    print99(n)
  }

  //编写一个函数，输出99乘法表
  def print99(n: Int) = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j, i, j * i)
      }
      println()
    }
  }
}

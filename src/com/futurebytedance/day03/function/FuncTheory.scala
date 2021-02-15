package com.futurebytedance.day03.function

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 22:20
 * @version 1.0
 * @Description 方法/函数原理
 */
object FuncTheory {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 3
    val res = sum(n1, n2)
    println("res=" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}

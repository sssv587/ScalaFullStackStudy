package com.futurebytedance.day04.homework

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 0:32
 * @version 1.0
 * @Description
 */
object Exercise06 {
  def main(args: Array[String]): Unit = {
    var res = 1L
    var res2 = 1L
    //这里我们解释
    //1.
    "Hello".foreach(res *= _.toLong)
    println("res=" + res)

    "Hello".foreach(myCount)
    println("res2=" + res2)

    def myCount(char: Char): Unit = {
      res2 *= char.toLong
    }
  }
}

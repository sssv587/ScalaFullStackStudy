package com.futurebytedance.day03.recursion

import scala.annotation.tailrec

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 22:35
 * @version 1.0
 * @Description
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    test(4)
    test2(4)
  }

  def test(n: Int) {
    if (n > 2) {
      test(n - 1)
    }
    println("n=" + n)
  }

  @tailrec
  def test2(n: Int) {
    if (n > 2) {
      test2 (n - 1)
    } else {
      println("n=" + n)
    }
  }
}

package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:24
 * @version 1.0
 * @Description
 */
object Exercise06 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 333, 4, 6, 4, 4, 9, 32, 6, 9, 0, 2)
    val maxValue = arr.reduceLeft(f1)
    println(maxValue)
  }

  //如何用reduceLeft得到数组Array(1,333,4,6,4,4,9,32,6,9,0,2)中的最大元素?
  def f1(x1: Int, x2: Int): Int = if (x1 > x2) x1 else x2
}

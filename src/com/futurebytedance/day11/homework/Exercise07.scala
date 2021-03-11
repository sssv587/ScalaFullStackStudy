package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:27
 * @version 1.0
 * @Description
 */
object Exercise07 {
  def main(args: Array[String]): Unit = {
    val multiply = f(4)
    println(multiply)
  }

  //用to和reduceLeft实现阶乘函数,不得使用循环或递归
  def f(x: Int): Int = {
    (1 to x).product
  }
}

package com.futurebytedance.day09.recursive

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 15:15
 * @version 1.0
 * @Description 使用递归求一个数的阶乘
 */
object RecursiveMultiply {
  def main(args: Array[String]): Unit = {
    println(factorial(10))
  }

  //求出阶乘
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }
}

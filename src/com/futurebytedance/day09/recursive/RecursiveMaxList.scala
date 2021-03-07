package com.futurebytedance.day09.recursive

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 15:05
 * @version 1.0
 * @Description 递归的案例
 */
object RecursiveMaxList {
  def main(args: Array[String]): Unit = {
    println(max(List(1)))
    println(max(List(1, -1, 9)))
  }

  //使用递归求List中的最大元素
  def max(xs: List[Int]): Int = {
    //如果为empty，抛出异常
    if (xs.isEmpty) {
      throw new NoSuchElementException
    }
    if (xs.size == 1) //如果只有一个元素，就是它
      xs.head
    else if (xs.head > max(xs.tail)) xs.head else max(xs.tail)
  }
}

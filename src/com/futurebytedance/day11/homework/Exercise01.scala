package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 21:46
 * @version 1.0
 * @Description
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val tuple = swap((1, 2))
    println(tuple)
  }

  //利用模式匹配，编写一个swap函数，接受一个整数的对偶，返回对偶的两个组成部件互换位置的新对偶
  def swap[T, S](tup: (T, S)): Any = {
    tup match {
      case (a, b) => (b, a)
      case _ => println("没有匹配到..")
    }
  }
}

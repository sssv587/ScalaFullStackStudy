package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 21:53
 * @version 1.0
 * @Description
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    val list = List(Some(1), Some(2), Some(3), None, Some(10))
    val sumValue = mySum(list)
    println(sumValue)
  }

  //3、编写一个函数，计算List[Option[Int]]中所有非None值之和。不得使用match语句。
  def mySum(lst: List[Option[Int]]): Int = lst.map(_.getOrElse(0)).sum
}

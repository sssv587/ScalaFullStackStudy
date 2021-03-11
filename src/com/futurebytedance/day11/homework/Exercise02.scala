package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 21:48
 * @version 1.0
 * @Description
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    println(swap(Array(1, 2, "hello")).mkString(","))
    println(swap(Array("tom")).mkString(","))
  }

  //2、利用模式匹配，编写一个swap函数，交换数组中的前两个元素的位置，前提条件是数组长度至少为2
  def swap(arr: Array[Any]): Array[Any] = {
    arr match {
      case Array(first, second, rest@_*) => Array(second, first) ++ rest
      case _ => arr
    }
  }
}

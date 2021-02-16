package com.futurebytedance.day04.homework

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 0:22
 * @version 1.0
 * @Description
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    //定义List集合
    val list = List(1, 2, 3)
    println(list.reverse) //(3,2,1)
    println((1 to 10).reverse)

    for(i <- 0 to 10 reverse){
      println(i)
    }
  }
}

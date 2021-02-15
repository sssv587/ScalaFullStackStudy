package com.futurebytedance.day03.lazyi

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 2:19
 * @version 1.0
 * @Description
 */
object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("-----------------------")
    println("res=" + res) //在要使用res前，才执行
  }

  //sum函数，返回和
  def sum(n1: Int, n2: Int): Int = {
    println("sum(执行了)..")
    n1 + n2
  }
}

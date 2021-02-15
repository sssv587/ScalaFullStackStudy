package com.futurebytedance.day03.funcdetails

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 23:33
 * @version 1.0
 * @Description
 */
object VarParameters {
  def main(args: Array[String]): Unit = {
    //编写一个函数sum，可以求出 1到多个int的和
    println(sum(10, 30, 10, 3, 4, 57))
    println(test())
  }

  //可变参数需要写在形参列表的最后
  def sum(n1: Int, args: Int*): Int = {
    println("args.length=" + args.length)
    //遍历
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }

  //可变参数需要写在形参列表的最后
  //  def sum2(args: Int*, n1: Int): Int = {
  //    println("args.length=" + args.length)
  //    //遍历
  //    var sum = n1
  //    for (item <- args) {
  //      sum += item
  //    }
  //    sum
  //  }

  def test() /*[:Unit=]*/ { //过程

  }
}

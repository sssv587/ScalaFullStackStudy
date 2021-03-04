package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/4 - 23:55
 * @version 1.0
 * @Description 偏函数的简化形式
 */
object PartialFuncDemo03 {
  def main(args: Array[String]): Unit = {
    implicit def dToInt(s: Double): Int = {
      s.toInt
    }

    //可以将前面案例的偏函数简写
    //第一种简写形式
    def f2: PartialFunction[Any, Int] = {
      //简写成case语句
      case i: Int => i + 1
      case d: Double => d * 2
    }

    val list2 = List(1, 2, 3, 4, 2.4, "ABC").collect(f2)
    println("list2=" + list2) //List(2, 3, 4, 5, 4)

    //第二种简写形式
    val list3 = List(1, 2, 3, 4, 5, 3.5, "hello").collect({
      case i: Int => i + 1
      case j: Double => j * 3
      case k: String => 1
    })
    println("list3=" + list3) //List(2.0, 3.0, 4.0, 5.0, 6.0, 10.5, 1.0)
  }
}

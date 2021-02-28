package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 1:01
 * @version 1.0
 * @Description fold
 */
object FoldDemo02 {
  def main(args: Array[String]): Unit = {
    val list4 = List(1, 9, 2, 8)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    var i6 = (1 /: list4) (minus) // 等价于 list4.foldLeft(1).(minus)
    println(i6)

    i6 = (100 /: list4) (minus)
    println(i6)

    i6 = (list4 :\ 10) (minus) //等价于 list4.foldRight(10).(minus)
    println(i6)
  }
}

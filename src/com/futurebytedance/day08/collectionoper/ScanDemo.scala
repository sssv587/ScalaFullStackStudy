package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 1:06
 * @version 1.0
 * @Description scan
 */
object ScanDemo {
  def main(args: Array[String]): Unit = {
    //普通函数
    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    //5 (1,2,3,4,5) => Vector(5,4,2,-1,-5,-10)
    val i8 = (1 to 5).scanLeft(5)(minus)
    println(i8)

    def add(num1: Int, num2: Int): Int = {
      num1 + num2
    }

    //5 (1,2,3,4,5) => Vector(5,6,8,11,15,20)
    val i9 = (1 to 5).scanLeft(5)(add)
    println(i9)

    //(1,2,3,4,5) => (20,19,17,14,10,5)
    val i10 = (1 to 5).scanRight(5)(add)
    println(i10)
  }
}

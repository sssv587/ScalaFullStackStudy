package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 0:46
 * @version 1.0
 * @Description reduce练习
 */
object ReduceExercise {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    // (((1-2) - 3) - 4) - 5 = -13
    println(list.reduceLeft(minus)) // -13
    // 1 - (2 - (3 -(4 - 5))) = 3
    println(list.reduceRight(minus)) // 3
    // reduce等价于reduceLeft
    println(list.reduce(minus)) // -13

    val list1 = List(3, 4, 2, 7, 5)
    val minus1 = list1.reduce(min)
    println(minus1)
  }

  //求出最小值
  def min(n1: Int, n2: Int): Int = {
    if (n1 > n2) {
      n2
    } else {
      n1
    }
  }
}

package com.futurebytedance.day12.generic

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 0:54
 * @version 1.0
 * @Description 泛型
 */
object GenericDemo03 {
  def main(args: Array[String]): Unit = {
    val list = List("hello", "dog", "world")
    val list1 = List(90, 10, 23)

    println(getMidEle[String](list))
    println(getMidEle[Int](list1))
  }

  /*
  定义一个函数，可以获取各种类型的 List 的中间index的值
  使用泛型完成
   */
  def getMidEle[A](l: List[A]): A = {
    l(l.length / 2)
  }
}

package com.futurebytedance.day07.collection

import scala.collection.mutable

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 21:38
 * @version 1.0
 * @Description Set
 */
object SetDemo {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3) //不可变
    println(set)

    val set1 = mutable.Set(1, 2, "hello") //可以变
    println(set1)

    //可变集合Set的元素的添加
    val set2 = mutable.Set(1, 2, 4, "abc")
    set2.add(90)
    set2 += 78
    set2.+=(90)
    println(set2)

    //可变Set的元素的删除
    set2 -= 2
    set2.-=(4)
    set2.remove("abc")
    println(set2)

    //Set集合的遍历
    for (x <- set2) {
      println(x)
    }
  }
}

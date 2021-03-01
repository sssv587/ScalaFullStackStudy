package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 23:08
 * @version 1.0
 * @Description iterator
 */
object IteratorDemo {
  def main(args: Array[String]): Unit = {
    val iterator1 = List(1, 2, 3, 4, 5).iterator // 得到迭代器
    println("--------遍历方式1 -----------------")
    while (iterator1.hasNext) {
      println(iterator1.next())
    }

    println("--------遍历方式2 for -----------------")
    val iterator2 = List(11, 22, 33, 44, 55).iterator // 得到迭代器
    for (enum <- iterator2) {
      println(enum) //
    }
  }
}

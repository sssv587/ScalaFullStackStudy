package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 22:50
 * @version 1.0
 * @Description wordCount案例
 */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    val lines = List("atguigu liu hello ddd", "atguigu liu aaa aaa aaa ccc ddd uuu", "liu", "ddd")
    val map = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1)
    val list = map.map(s => (s._1, s._2.size)).toList.sortBy(_._2)
    println(list)
  }
}

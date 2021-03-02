package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 22:16
 * @version 1.0
 * @Description Parallel-并行集合
 */
object ParallelDemo01 {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(println(_))
    println()
    //这里输出的结果是无序的，说明是将println任务分配给不同cpu
    (1 to 5).par.foreach(println(_))

    println()
    val list = List(1, 2, 3, 4, 5)
    list.par.foreach(println)
  }
}

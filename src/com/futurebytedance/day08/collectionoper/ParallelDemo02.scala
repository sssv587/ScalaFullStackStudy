package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 22:20
 * @version 1.0
 * @Description Parallel-并行计算
 */
object ParallelDemo02 {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map(_ => Thread.currentThread.getName).distinct
    val result2 = (0 to 100).par.map(_ => Thread.currentThread.getName).distinct
    println(result1) //非并行
    println(result2) //并行
  }
}

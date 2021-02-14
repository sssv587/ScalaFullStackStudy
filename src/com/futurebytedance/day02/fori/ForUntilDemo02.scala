package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:09
 * @version 1.0
 * @Description
 */
object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 11
    for (i <- start until end) {
      println("你好，世界!\t" + i)
    }
  }
}

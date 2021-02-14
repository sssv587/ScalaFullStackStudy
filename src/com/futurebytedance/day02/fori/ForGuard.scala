package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:13
 * @version 1.0
 * @Description
 */
object ForGuard {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 if i != 2) {
      print(i + " ")
    }
    println()
  }
}

package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:24
 * @version 1.0
 * @Description for循环中括号的使用
 */
object BracketsFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = i * 2) {
      println(" i= " + i + " j= " + j)
    }

    //等价
    println("------------------------------------")
    for {i <- 1 to 3
         j = i * 2} {
      println(" i= " + i + " j= " + j)
    }
  }
}

package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:17
 * @version 1.0
 * @Description
 */
object MultiFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j)
    }

    //上面的写法，可以写成
    println("---------------------------------")
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(" i =" + i + " j = " + j)
      }
    }
  }
}

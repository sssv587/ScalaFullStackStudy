package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:15
 * @version 1.0
 * @Description
 */
object ForVar {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3; j = 4 - i) {
      print(j + " ")
    }
  }
}

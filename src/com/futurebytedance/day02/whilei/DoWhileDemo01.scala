package com.futurebytedance.day02.whilei

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:41
 * @version 1.0
 * @Description Do-While的使用
 */
object DoWhileDemo01 {
  def main(args: Array[String]): Unit = {
    var i = 0 //for
    do {
      println("你好，中国" + i)
      i += 1
    } while (i < 10)
  }
}

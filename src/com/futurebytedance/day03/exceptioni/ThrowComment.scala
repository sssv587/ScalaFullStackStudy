package com.futurebytedance.day03.exceptioni

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 2:51
 * @version 1.0
 * @Description
 */
object ThrowComment {
  def main(args: Array[String]): Unit = {
    f11()
  }

  @throws(classOf[NumberFormatException]) //等同于Java NumberFormatException.class
  def f11() = {
    "abc".toInt
  }
}

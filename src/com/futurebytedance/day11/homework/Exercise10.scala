package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:48
 * @version 1.0
 * @Description
 */
object Exercise10 {
  def main(args: Array[String]): Unit = {

  }

  //实现一个unless控制抽象，工作机制类似if,但条件是反过来的
  def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) block
    unless(0 > 1) {
      println("Unless!")
    }
  }
}

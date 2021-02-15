package com.futurebytedance.day02.homework

import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 21:26
 * @version 1.0
 * @Description
 */
object HomeWork01 {
  def main(args: Array[String]): Unit = {
    /*
    100以内的数求和，求出当和 第一次大于20的当前数是多少？
     */
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println("第一次大于20的当前数:" + i)
          break
        }
      }
    }

    //除了上面的break机制来中断，我们也可以使用循环守卫实现中断
    println("===============================")
    var loop = true
    var sum2 = 0
    for (i <- 1 to 100 if loop) {
      sum2 += i
      if (sum2 > 20) {
        println("第一次大于20的当前数:" + i)
        loop = false
      }
      println("i=" + i)
    }
  }
}

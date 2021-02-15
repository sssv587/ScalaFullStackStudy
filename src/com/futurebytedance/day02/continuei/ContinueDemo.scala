package com.futurebytedance.day02.continuei

import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 21:19
 * @version 1.0
 * @Description
 */
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1.1 to 10
    //2.循环守卫 if i!=4 && i != 5 这个条件为true，才执行循环体
    //即当i==4或者i==5时，就跳过
    for (i <- 1 to 10 if i != 4 && i != 5) {
      println("i=" + i)
    }

    //也可以写成如下的形式
    println("=========================")
    for (i <- 1 to 10) {
      if (i != 4 && i != 5) {
        println("i=" + i)
      }
    }

    println("ok~")

    //注意break函数，可以使用在for或者do..while
    breakable {
      for (i <- 1 to 100) {
        println("i=" + i)
        if (i == 20) {
          break
        }
      }
    }
    println("ok2~")
  }
}

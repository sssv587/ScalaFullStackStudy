package com.futurebytedance.day02.ifelse

import scala.io.StdIn

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 0:30
 * @version 1.0
 * @Description
 */
object Demo03 {
  def main(args: Array[String]): Unit = {
    /*
    岳小鹏参加scala考试，他和父亲岳不群达成承诺：
    如果：
    成绩为100分时，奖励一辆BMW；
    成绩为(80，99]时，奖励一台iphone7plus；
    当成绩为[60,80]时，奖励一个 iPad；
    其它时，什么奖励也没有。

    说明: 成绩在控制台输入!

     */
    println("请输入成绩:")
    val score = StdIn.readDouble()
    if (score == 100) {
      println("成绩为100分时，奖励一辆BMW")
    } else if (score > 80 && score <= 99) {
      println("成绩为(80，99]时，奖励一台iphone7plus")
    } else if (score > 60 && score <= 80) {
      println("当成绩为[60,80]时，奖励一个 iPad")
    } else {
      println("什么奖励也没有")
    }
  }
}

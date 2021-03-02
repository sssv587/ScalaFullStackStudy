package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 23:06
 * @version 1.0
 * @Description 模式匹配-守卫
 */
object MatchExercise01 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ => digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }
  }
}

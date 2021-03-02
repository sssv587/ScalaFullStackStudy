package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/3 - 0:06
 * @version 1.0
 * @Description 模式匹配-匹配列表
 */
object MatchList {
  def main(args: Array[String]): Unit = {
    for (list <- Array(List(0), List(1, 0), List(88), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0 ..."
        case x :: Nil => x
        case _ => "something else"
      }
      println(result)
    }
  }
}

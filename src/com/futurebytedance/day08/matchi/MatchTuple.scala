package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/3 - 0:11
 * @version 1.0
 * @Description 模式匹配-匹配元祖
 */
object MatchTuple {
  def main(args: Array[String]): Unit = {
    for (pair <- Array((0, 1), (1, 0), (10, 30), (2, 1), (1, 0, 2))) {
      val result = pair match {
        case (0, _) => "0 ..."
        case (y, 0) => y
        case (a, b) => (b, a)
        case _ => "other"
      }
      println(result)
    }
  }
}

package com.futurebytedance.day02.ifelse

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 2:51
 * @version 1.0
 * @Description
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    var sumVal = 9
    val result =
      if (sumVal > 20) {
        "结果大于20"
      }
    println(result)

    val sumVal1 = 60
    val result1 = if (sumVal1 > 20) {
      "结果大于20"
    }
    println(result1)
  }
}

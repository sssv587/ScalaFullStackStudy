package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/3 - 1:33
 * @version 1.0
 * @Description 变量声明中的模式匹配
 */
object MatchVarDefine {
  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)

    val (q, r) = BigInt(10) /% 3 // 包含了2个连续的运算符
    println("q =" + q)
    println("r =" + r)

    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr
    println(first, second)
  }
}

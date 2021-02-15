package com.futurebytedance.day03.function

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 22:13
 * @version 1.0
 * @Description 函数/方法 定义
 */
object FuncDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    val res = getRes(n1, n2, '-')
    println("res=" + res)
  }

  //定义函数/方法
  def getRes(n1: Int, n2: Int, operator: Char) = {
    if (operator == '+') {
      n1 + n2 //返回
    } else if (operator == '-') {
      n1 - n2
    } else if (operator == '*') {
      n1 * n2
    } else if (operator == '/') {
      n1 / n2
    } else {
      //返回null
      null
    }
  }
}

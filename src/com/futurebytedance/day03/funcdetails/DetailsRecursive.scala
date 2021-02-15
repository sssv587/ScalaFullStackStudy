package com.futurebytedance.day03.funcdetails

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 23:27
 * @version 1.0
 * @Description 递归函数未执行之前是无法推断出来结果类型，在使用时必须有明确的返回值类型
 */
object DetailsRecursive {
  def main(args: Array[String]): Unit = {
    f1(2)
  }

  def f1(n: Int): Int = {
    if (n == 1) {
      1
    } else {
      f1(n - 1)
    }
  }
}

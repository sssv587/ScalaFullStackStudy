package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 1:36
 * @version 1.0
 * @Description 函数柯里化
 */
object CurryDemo01 {
  def main(args: Array[String]): Unit = {
    def mul(x: Int, y: Int) = x * y
    println(mul(10, 10))

    def mulCurry(x: Int) = (y: Int) => x * y
    println(mulCurry(10)(9))

    def mulCurry2(x: Int)(y:Int) = x * y
    println(mulCurry2(10)(8))

  }
}

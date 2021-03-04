package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/5 - 0:57
 * @version 1.0
 * @Description 高阶函数
 */
object HighOrderFunctionDemo02 {
  def main(args: Array[String]): Unit = {
    //说明
    //1.minusXy是一个高阶函数，因为它返回匿名函数
    //2.返回的匿名函数 (y: Int) => x - y
    //3.返回的匿名函数可以使用变量接收

    def minusXy(x: Int) = {
      (y: Int) => x - y //匿名函数
    }

    //分步执行
    //f1 就是(y: Int) => 3 - y
    val f1 = minusXy(3)
    println("f1的类型是:" + f1)
    println(f1(1)) // 2
    println(f1(9)) // -6

    //也可以一步到位的调用
    println(minusXy(4)(9)) // -5
  }
}

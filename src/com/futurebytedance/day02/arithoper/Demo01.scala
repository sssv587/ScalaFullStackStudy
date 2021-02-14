package com.futurebytedance.day02.arithoper

/**
 * @author yuhang.sun
 * @date 2021/2/14 - 23:17
 * @version 1.0
 * @Description 算术运算符
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val r1: Int = 10 / 3 // 3 [不会进行四舍五入]
    println("r1=" + r1)
    val r2: Double = 10 / 3 //【3.0 1.先得到 3 => 3.0 】
    println("r2=" + r2)
    val r3: Double = 10.0 / 3 //[3.3333333..]
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f")) // 格式化输出， 保留小数点 2 位，并且进行四舍五入

    //%的使用
    //1.%的运算的原则 : a % b = a - a/b * b
    println(10 % 3) //1
    println(-10 % 3) //-1 // (-10) - (-3) * 3 = -1
    println(10 % -3) // 1
    println(-10 % -3) // -1

    //++ 和 --
    //说明，在scala中没有++和--，而使用+=1和-=1
    var num1 = 10
    //num++ 错误
    num1 += 1 // 替代num1++
    //num1-- 错误
    num1 -= 1 //替代num--
    println(num1)
  }
}

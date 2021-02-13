package com.futurebytedance.day02.datatype

/**
 * @author yuhang.sun
 * @date 2021/2/13 - 23:39
 * @version 1.0
 * @Description
 */
object CharDemo {
  def main(args: Array[String]): Unit = {
    val char1: Char = 97
    //当我们输出一个char类型是，他会输出该数字对应的字符(码值表unicode)//unicode码值表对应ascii
    println("char1=" + char1)

    //char 可以当作数字进行运行
    val char2: Char = 'a'
    val num = 10 + char2
    println("num=" + num)

    //原因和分析
    //1.当把一个计算的结果赋值给一个变量，则编译器会进行类型转换及判断(即会看范围+类型)
    //2.当把一个字面量赋值给一个变量，则编译器会进行范围的判定
    //    var c2: Char = 'a' + 1
    //    var c3: Char = 97 + 1
    var c4: Char = 98
    println("c4=" + c4)
    //    var c5: Char = 99999
  }
}

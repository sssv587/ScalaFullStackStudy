package com.futurebytedance.day02.dataconvert

/**
 * @author yuhang.sun
 * @date 2021/2/14 - 0:35
 * @version 1.0
 * @Description String与基本数据类型间的转换
 */
object String2Basic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    val s1 = d1 + "" //以后看到有下划线，就表示编译器做了转换

    //String类型转基本数据类型
    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble
    val num4 = s2.toFloat

    println("ok~~~")

    //在将String类型转成基本数据类型时，要确保String类型能够转换成有效的数据，比如
    //我们可以把"123"，转成一个整数，但是不能把"hello"转成一个整数
    val s3 = "hello"
//    println(s3.toInt)

    //思考就是要把"12.5"转成Int
    //在scala中，不是将小数点后的数据进行截取，而是会抛出异常
    val s4 = "12.5"
    println(s4.toDouble.toInt)
  }
}

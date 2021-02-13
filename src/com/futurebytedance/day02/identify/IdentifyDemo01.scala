package com.futurebytedance.day02.identify

/**
 * @author yuhang.sun
 * @date 2021/2/14 - 0:45
 * @version 1.0
 * @Description
 */
object IdentifyDemo01 {
  def main(args: Array[String]): Unit = {
    //首字符为操作符(比如 + - * /),后续字符也许跟操作符，至少一个
    val ++ = "hello,world!"
    println(++)

    val -+*/ = 90 //ok
    println("res=" + -+*/)

    //看看编译器如何处理
    //++ => $plus$plus

    //val +q = "abc" //error

    //用反引号`....`包括的任意字符串，即使是关键字(39个)也可以
    val `true` = "hello,scala!"
    println("内容=" + `true`)

    //不能使用_做标识符
//    var _ = "jack"
//    println(_)
  }
}

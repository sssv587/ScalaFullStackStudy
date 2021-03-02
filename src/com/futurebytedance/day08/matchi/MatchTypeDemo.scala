package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 23:36
 * @version 1.0
 * @Description 模式匹配-类型匹配
 * 1)Map[String, Int] 和Map[Int, String]是两种不同的类型，其它类推。
 * 2)在进行类型匹配时，编译器会预先检测是否有可能的匹配，如果没有则报错
 * 3)一个说明:val result = obj match {case i : Int => i} //case i : Int => i 表示将 i = obj (其它类推)，然后再判断类型
 * 4)如果 case _ 出现如下情况(忽略匹配的变量值)，则表示隐藏变量名，即不使用,而不是表示默认匹配
 *
 */
object MatchTypeDemo {
  def main(args: Array[String]): Unit = {
    // 类型匹配, obj 可能有如下的类型
    val a = 6
    //说明 obj 实例的类型 根据a的值来返回
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")

    //说明
    //1.根据 obj的类型来匹配
    // 返回值
    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println(result)
  }
}

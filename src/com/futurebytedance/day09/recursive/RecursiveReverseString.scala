package com.futurebytedance.day09.recursive

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 15:11
 * @version 1.0
 * @Description 递归解决字符串的反转
 */
object RecursiveReverseString {
  def main(args: Array[String]): Unit = {
    val str = "asdsanfklnfklasfj"
    println(reverse(str))
  }

  //使用递归完成对字符串的反转
  def reverse(xs: String): String = {
    if (xs.length == 1) xs //如果长度为1，就返回
    else reverse(xs.tail) + xs.head //如果长度>1，就是执行这句话
  }
}

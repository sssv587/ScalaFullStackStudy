package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/3 - 1:17
 * @version 1.0
 * @Description 模式匹配-匹配对象
 * 1)当case后面的对象提取器方法的参数为多个，则会默认调用def unapplySeq()方法
 * 2)如果unapplySeq返回是Some，获取其中的值,判断得到的sequence中的元素的个数是否是三个,如果是三个，则把三个元素分别取出，赋值给first，second和third
 * 3)其它的规则不变
 *
 */
object MatchObjectDemo02 {
  def main(args: Array[String]): Unit = {
    val namesString = "Alice,Bob,Thomas"
    namesString match {
      //当执行case Names(first, second, third)
      //1.会调用unapplySeq(str)，把"Alice,Bob,Thomas"传入给str
      //2.如果返回的是Some("Alice","Bob","Thomas")，分别给(first, second, third)
      //注意：这里返回的值得个数需要和(first, second, third)要保持一致
      //3.如果返回的是None，表示匹配失败
      case Names(first, second, third) =>
        println("three people's names")
        // 打印字符串
        println(s"$first $second $third")
      case _ => println("nothing matched")
    }
  }
}


object Names {
  // unapplySeq
  // 当构造器是多个参数时，就会触发这个对象提取器
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(","))
      Some(str.split(","))
    else
      None
  }
}

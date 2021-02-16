package com.futurebytedance.day04.oop

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 3:42
 * @version 1.0
 * @Description
 */
object MemState {
  def main(args: Array[String]): Unit = {
    val p1 = new Person2
    p1.name = "jack"
    p1.age = 10

    val p2 = p1
    println(p2 == p1) //true

    p1.name = "tom"
    println(p2.name)
  }
}

class Person2 {
  var name = ""
  var age: Int = _ //如果是用  _ 方式给默认值，则属性必须指定类型
}

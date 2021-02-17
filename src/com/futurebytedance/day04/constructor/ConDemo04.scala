package com.futurebytedance.day04.constructor

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 1:55
 * @version 1.0
 * @Description 属性高级
 * 构造器参数
 * 1)Scala类的主构造器的形参未用任何修饰符修饰，那么这个参数是局部变量。
 * 2)如果参数使用val关键字声明，那么Scala会将参数作为类的私有的只读属性使用
 * 3)如果参数使用var关键字声明，那么Scala会将参数作为类的成员属性使用,并会提供属性对应的xxx()[类似getter]/xxx_$eq()[类似setter]方法，即这时的成员属性是私有的，但是可读写。
 */
object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("smith")
    worker.name // 不能访问 inName

    val worker1 = new Worker2("smith2")
    worker1.inName
    println("hello!")

    val worker2 = new Worker3("smith3")
    worker2.inName
  }
}

//1.如果 主构造器是Worker(inName: String),那么inName就是一个局部变量
class Worker(inName: String) {
  var name = inName
}

//1.如果 主构造器是Worker2(val inName: String),那么inName就是Worker2的一个private的只读属性
class Worker2(val inName: String) {
  var name = inName
}

//1.如果 主构造器是Worker2(var inName: String),那么inName就是Worker2的一个private的可读写属性
class Worker3(var inName: String) {
  var name = inName
}

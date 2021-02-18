package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/19 - 1:11
 * @version 1.0
 * @Description Scala超类的构造说明
 *
 *              1.类有一个主构器和任意数量的辅助构造器，而每个辅助构造器都必须先调用主构造器(也可以是间接调用)
 *              2.只有主构造器可以调用父类的构造器。
 *              辅助构造器不能直接调用父类的构造器。
 *              在Scala的构造器中，你不能调用super(params)
 */
object ScalaBaseConstructor {
  def main(args: Array[String]): Unit = {
    //分析一下他的执行流程
    //1.因为scala遵守先构建父类部分 extends Person500
    //2.Person...
    //3.Emp .... (Emp500的主构造器)
    //4.Emp 辅助构造器~

    //1.Person...
    //2.Emp .... (Emp500的主构造器)
    //    val emp = new Emp500()

    println("===========================")

    //1.Person...
    //2.Emp .... (Emp500的主构造器)
    //3.Emp 辅助构造器~
    val emp2 = new Emp500("merry")

    println("===========================")

    //分析执行的顺序
    //1.Person...
    //2.默认的名字
    //3.Emp ....
    //4.Emp 辅助构造器~
    val emp3 = new Emp500("smith")

    println("===========================")

    //再测试一把
    //Person.. name = "terry"
    //Emp....
    //
    val emp4 = new Emp500("terry", 10)
    emp4.showInfo()
  }
}

class Person500(pName: String) {
  var name: String = pName
  println("Person...")

  def this() {
    this("默认的名字")
    println("默认的名字")
  }
}

class Emp500(eName: String, eAge: Int) extends Person500(eName) {
  println("Emp ....")

  //辅助构造器
  def this(name: String) {
    this("", 10) // 必须调用主构造器
    this.name = name
    println("Emp 辅助构造器~")
  }

  def showInfo(): Unit = {
    println("雇员的名字是:" + name)
  }
}

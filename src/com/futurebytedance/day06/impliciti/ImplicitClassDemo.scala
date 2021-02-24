package com.futurebytedance.day06.impliciti

/**
 * @author yuhang.sun
 * @date 2021/2/24 - 22:39
 * @version 1.0
 * @Description 隐式类
 * 1)其所带的构造参数有且只能有一个
 * 2)隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的(top-level  objects)。
 * 3)隐式类不能是case class（case class在后续介绍 样例类）
 * 4)作用域内不能有与之相同名称的标识符
 */
object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    //DB1会对应生成隐式类
    //DB1是一个隐式类，当我们在该隐式类的作用域范围，创建MySQL实例
    //该隐式类就会生效，这个转换的工作仍然是编译器完成
    //看底层
    implicit class DB1(val m: MySQL1) { //ImplicitClassDemo$DB1$2
      def addSuffix(): String = { //方法
        m + " scala"
      }
    }
    val mysql1 = new MySQL1
    mysql1.sayOk()
    println(mysql1.addSuffix()) //研究 如何关联到 DB$1(mySQL).addSuffix()

    implicit def f1(d: Double): Int = {
      d.toInt
    }

    def test1(n1: Int): Unit = {
      println("ok")
    }

    test1(10.1)
  }
}

class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk")
  }
}

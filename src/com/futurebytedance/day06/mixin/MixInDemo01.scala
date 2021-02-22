package com.futurebytedance.day06.mixin

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 20:02
 * @version 1.0
 * @Description 特质动态混入
 *
 * 1)除了可以在类声明时继承特质以外，还可以在构建对象时混入特质，扩展对象的功能
 * 2)此种方式也可以应用于对抽象类功能进行扩展
 * 3)动态混入是Scala特有的方式（java没有动态混入），可在不修改类声明/定义的情况下，扩展类的功能，非常的灵活，耦合性低 。
 * 4)动态混入可以在不影响原有的继承关系的基础上，给指定的类扩展功能。
 */
object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    //在不修改类的定义的基础上，让他们可以使用trait方法
    val oracleDB = new OracleDB with Operate3
    oracleDB.insert(100) //

    val mySQL = new MySQL3 with Operate3
    mySQL.insert(200)

    //如果一个抽象类有抽象方法，如何动态混入特质
    val mysql = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }
    mysql.insert(999)
    mysql.say()
  }
}

trait Operate3 { //特质
  def insert(id: Int): Unit = { //方法(实现)
    println("插入数据 = " + id)
  }
}

class OracleDB { //空
}

abstract class MySQL3 { //空

}

abstract class MySQL3_ {
  def say()
}



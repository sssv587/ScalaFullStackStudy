package com.futurebytedance.day06.impliciti

/**
 * @author yuhang.sun
 * @date 2021/2/24 - 22:11
 * @version 1.0
 * @Description 隐式转换丰富类库功能
 *              通过隐式转换函数给类动态添加功能
 */
object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数，丰富MySQL功能
    implicit def addDelete(mySQL: MySQL): DB = {
      new DB
    }

    //创建一个MySQL对象
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete() //编译器工作 分析 addDelete$1(mySQL).delete()
    mySQL.update()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }

  def update(): Unit = {
    println("update")
  }
}

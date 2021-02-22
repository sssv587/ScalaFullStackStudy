package com.futurebytedance.day06.mixin

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 21:40
 * @version 1.0
 * @Description 特质中的字段
 */
object MixInProperty {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL6 with DB6 {
      override val sal: Int = 1
    }
  }
}

trait Operate6 {
  var opertype: String

  def insert()
}

trait DB6 extends Operate6 {
  val sal: Int
  var opertype: String = "insert"

  def insert(): Unit = {
  }
}

class MySQL6 {}

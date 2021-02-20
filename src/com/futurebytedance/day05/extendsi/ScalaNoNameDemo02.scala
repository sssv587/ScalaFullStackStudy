package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 0:13
 * @version 1.0
 * @Description
 */
object ScalaNoNameDemo02 {
  def main(args: Array[String]): Unit = {
    val monster = new Monster {
      override var name: String = _

      override def cry(): Unit = {
        println("ok~~~")
      }
    }
    monster.cry()
  }
}

abstract class Monster {
  var name: String

  def cry()
}


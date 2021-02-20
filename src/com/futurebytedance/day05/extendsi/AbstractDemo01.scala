package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/20 - 23:52
 * @version 1.0
 * @Description
 */
object AbstractDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

//抽象类
abstract class Animal {
  var name: String //抽象的字段
  var age: Int //抽象的字段
  var color: String = "black" //普通属性
  def cry() //抽象方法，不需要标记abstract
}

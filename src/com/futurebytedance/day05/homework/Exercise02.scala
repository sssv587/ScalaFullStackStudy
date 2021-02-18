package com.futurebytedance.day05.homework

import scala.beans.BeanProperty

/**
 * @author yuhang.sun
 * @date 2021/2/18 - 23:22
 * @version 1.0
 * @Description
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {

  }
}

class Student {
  //读写属性
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
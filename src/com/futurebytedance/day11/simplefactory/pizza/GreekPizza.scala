package com.futurebytedance.day11.simplefactory.pizza

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 0:03
 * @version 1.0
 * @Description
 */
class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "希腊pizza"
    println(this.name + "preparing")
  }
}

package com.futurebytedance.day11.simplefactory.pizza

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 0:03
 * @version 1.0
 * @Description
 */
abstract class Pizza {

  var name: String = _

  //假定，每种pizza 的准备原材料不同，因此做成抽象的..
  def prepare() //抽象方法

  def cut(): Unit = {
    println(this.name + " cutting ..")
  }

  def bake(): Unit = {
    println(this.name + " baking ..")
  }

  def box(): Unit = {
    println(this.name + " boxing ..")
  }

}

package com.futurebytedance.day11.decorator.mycoffee

import com.futurebytedance.day11.decorator.Drink


//在Drink和单品咖啡，做了一个缓冲层
//这里是为了扩展，针对当前项目可以不要
class Coffee extends Drink{
  override def cost(): Float = {
    super.getPrice()
  }
}

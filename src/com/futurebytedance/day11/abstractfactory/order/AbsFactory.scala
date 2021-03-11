package com.futurebytedance.day11.abstractfactory.order

import com.futurebytedance.day11.abstractfactory.pizza.Pizza


trait AbsFactory {

  //一个抽象方法
  def  createPizza(t : String ): Pizza

}

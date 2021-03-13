package com.futurebytedance.day11.decorator.mydecorator

import com.futurebytedance.day11.decorator.Drink


class Chocolate(obj: Drink) extends Decorator(obj) {

  super.setDescription("Chocolate")
  //一份巧克力3.0f
  super.setPrice(3.0f)

}

package com.futurebytedance.day11.decorator.mydecorator

import com.futurebytedance.day11.decorator.Drink



class NewMilk(obj: Drink) extends Decorator(obj) {

  setDescription("新式Milk")
  setPrice(4.0f)
}
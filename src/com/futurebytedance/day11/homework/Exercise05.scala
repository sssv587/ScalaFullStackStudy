package com.futurebytedance.day11.homework


/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:08
 * @version 1.0
 * @Description
 */
object Exercise05 {
  def main(args: Array[String]): Unit = {
    val list: List[(Int, Int)] = values((x: Int) => x * x, -5, 5)
    println(list)
  }

  /*
  编写函数values(fun:(Int)=>Int,low:Int,high:Int),
  该函数输出一个集合，对应给定区间内给定函数的输入和输出。=> 通过fun处理值=>(low,fun(x))
  比如，values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(5,25)
   */
  def values(fun: Int => Int, low: Int, high: Int): List[(Int, Int)] = {
    var newList = List[(Int, Int)]() //空集合，准备放我们的对偶
    (low to high) foreach {
      x => newList = newList :+ (x, fun(x)) //加入
    }
    newList //返回
  }
}

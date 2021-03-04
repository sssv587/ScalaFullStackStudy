package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/5 - 1:10
 * @version 1.0
 * @Description 参数类型推断
 * 1)map是一个高阶函数，因此也可以直接传入一个匿名函数，完成map
 * 2)当遍历list时，参数类型是可以推断出来的，可以省略数据类型Int println(list.map((x)=>x + 1))
 * 3)当传入的函数，只有单个参数时，可以省去括号 println(list.map(x=>x + 1))
 * 4)如果变量只在=>右边只出现一次，可以用_来代替 println(list.map(_ + 1))
 *
 */
object ParameterInfer {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.map((x: Int) => x + 1))
    println(list.map((x) => x + 1))
    println(list.map(x => x + 1))
    println(list.map(_ + 1))

    println(list.reduce(f1)) // 10
    println(list.reduce((n1: Int, n2: Int) => n1 + n2)) //10
    println(list.reduce((n1, n2) => n1 + n2)) //10
    println(list.reduce(_ + _)) //10
  }

  def f1(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}

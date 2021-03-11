package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:29
 * @version 1.0
 * @Description
 */
object Exercise08 {
  def main(args: Array[String]): Unit = {
    println(largest((x: Int) => 10 * x - x * x, 1 to 10))
  }

  // 编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),
  // 输出在给定输入序列中给定函数的最大值。(将inputs的各个元素传递给fun，返回最大值)
  // 举例来说，largest(x=>10x-xx,1 to 10)应该返回25.
  // 不得使用循环或递归，即使用高阶函数完成
  def largest(fun: Int => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun).max
  }
}

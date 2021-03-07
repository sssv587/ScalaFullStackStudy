package com.futurebytedance.day09.recursive

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 15:19
 * @version 1.0
 * @Description 递归求解斐波那契数列
 */
object RecursiveFnb {
  def main(args: Array[String]): Unit = {
    var count = BigInt(0)
    println(fbn(21))
    println("递归的次数是=" + count)

    //研究下递归求斐波那契的数的递归次数的增长
    //递归的次数是指数增长
    def fbn(n: BigInt): BigInt = {
      count += 1
      if (n == 1 || n == 2) n
      else fbn(n - 1) + fbn(n - 2) //重复计算时，需要考虑优化 -> 迭代
    }
  }
}

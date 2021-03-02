package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 21:47
 * @version 1.0
 * @Description Stream
 * stream是一个集合。这个集合，可以用于存放无穷多个元素，但是这无穷个元素并不会一次性生产出来，而是需要用到多大的区间，就会动态的生产，末尾元素遵循lazy规则(即：要使用结果才进行计算的) 。
 *
 */
object StreamDemo {
  def main(args: Array[String]): Unit = {
    def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

    //创建Stream
    val stream1 = numsForm(1)
    println(stream1) // Stream(1, ?)
    //取出第一个元素
    println("head=" + stream1.head) // head=1
    println(stream1.tail) // Stream(2, ?) 当对流进行tail时，就会产生一个新的数据
    println(stream1) // Stream(1, 2, ?)

    def multi(x: BigInt): BigInt = {
      x * x
    }

    println(numsForm(5).map(multi)) // Stream(25, ?)

  }
}

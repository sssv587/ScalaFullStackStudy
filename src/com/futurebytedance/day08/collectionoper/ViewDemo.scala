package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 21:55
 * @version 1.0
 * @Description View
 * 1)view方法产出一个总是被懒执行的集合。
 * 2)view不会缓存数据，每次都要重新计算，比如遍历View时。
 */
object ViewDemo {
  def main(args: Array[String]): Unit = {
    def multiple(num: Int): Int = {
      num
    }

    //如果这个数，逆序后和原来的数相等，就返回一个true，否则返回false
    def eq(i: Int): Boolean = {
      println("eq 被调用")
      i.toString.equals(i.toString.reverse)
    }

    //说明: 没有使用view，常规方式
    val viewSquares1 = (1 to 100).map(multiple).filter(eq)
    println(viewSquares1)

    //使用view，来完成这个问题，程序中，对集合进行map、filter、reduce、fold...
    //你并不希望立即执行，而是在使用到结果才执行，则可以使用view来进行优化
    val viewSquares2 = (1 to 100).view.map(multiple).filter(eq)
    println(viewSquares2)

    //遍历
    for (item <- viewSquares2) {
      println("item" + item)
    }
  }
}

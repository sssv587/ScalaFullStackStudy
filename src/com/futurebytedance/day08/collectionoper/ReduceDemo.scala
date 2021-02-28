package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 0:34
 * @version 1.0
 * @Description reduce
 */
object ReduceDemo {
  def main(args: Array[String]): Unit = {
    /*
    使用化简的方式来计算List集合的和
     */
    val list = List(1, 20, 30, 4, 5)
    val res = list.reduceLeft(sum)

    //执行的流程分析
    //步骤1：(1+20)
    //步骤2：((1+20)+30)
    //步骤3：(((1+20)+30)+4)
    //步骤4：((((1+20)+30)+4)+5)
    println("res=" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum被调用")
    n1 + n2
  }
}

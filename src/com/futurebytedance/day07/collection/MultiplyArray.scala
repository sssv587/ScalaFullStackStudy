package com.futurebytedance.day07.collection

/**
 * @author yuhang.sun
 * @date 2021/2/25 - 1:22
 * @version 1.0
 * @Description 多维数组
 */
object MultiplyArray {
  def main(args: Array[String]): Unit = {
    //创建
    val arr = Array.ofDim[Int](3, 4)

    //遍历
    for (item <- arr) { //取出二维数组的各个元素(一维数组)
      for (item2 <- item) { //元素(一维数组)遍历
        print(item2 + "\t")
      }
      println()
    }

    //指定取出
    println(arr(1)(1))

    //修改值
    arr(1)(1) = 100

    //遍历
    for (i <- arr.indices) {
      for (j <- arr(0).indices) {
        print(arr(i)(j) + "\t")
      }
      println()
    }

    for (i <- 0 to arr.length - 1) {
      for (j <- 0 to arr(i).length - 1) {
        printf("arr[%d][%d]=%d\t", i, j, arr(i)(j))
      }
      println()
    }
  }
}

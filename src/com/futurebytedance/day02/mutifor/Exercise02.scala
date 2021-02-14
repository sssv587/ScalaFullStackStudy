package com.futurebytedance.day02.mutifor

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 4:02
 * @version 1.0
 * @Description
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    //3.打印出九九乘法表
    //思路分析
    //(1)使用两层循环,有9行，每1行的列数在增加
    //(2)根据逻辑，我们可以编写代码
    for (i <- 1 to 9) { //确定行数
      for (j <- 1 to i) { //确定列数
        printf("%d * %d = %d\t", j, i, i * j)
      }
      println()
    }
  }
}

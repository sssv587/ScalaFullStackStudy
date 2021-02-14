package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:32
 * @version 1.0
 * @Description
 */
object ForExercise01 {
  def main(args: Array[String]): Unit = {
    /*
    打印1~100之间所有是9的倍数的整数的个数及总和.
     */
    val start = 1
    val end = 100
    var count = 0
    var sum = 0
    for (i <- start to `end`) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    printf("count=%d,sum=%d", count, sum)

    println()

    //输出加法的循环表达式
    val num = 6
    for (i <- 1 to num) {
      printf("%d + %d = %d\n", i, num - i, num)
    }

  }
}

package com.futurebytedance.day07.collection

/**
 * @author yuhang.sun
 * @date 2021/2/25 - 0:49
 * @version 1.0
 * @Description 定长数组
 */
object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    //说明
    //1.使用的是 object Array 的apply
    //2.直接初始化数组，这时因为给了正数和字符串，这个数组的法宁就是Any
    //3.遍历方式一样
    val arr02 = Array(1, 3, "xxx")
    for (i <- arr02) {
      println(i)
    }

    //可以使用传统的方式遍历，使用下标方式遍历
    for (index <- arr02.indices) {
      println("arr02[" + index + "]=" + arr02(index))
    }
  }
}

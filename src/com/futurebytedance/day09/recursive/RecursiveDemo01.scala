package com.futurebytedance.day09.recursive

import java.text.SimpleDateFormat
import java.util.Date

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 14:50
 * @version 1.0
 * @Description 递归
 */
object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    //传统方法完成 1-50 的求和任务
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)

    println("date=" + date) //输出时间
    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999L) //BigInt(99999999l)[测试效率大数]
    //使用传统的while
    while (num <= maxVal) {
      res += num //累计
      num += 1 //变量的叠加
    }
    println("res=" + res) //结果,耗时6秒
    //再一次输出时间
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("date2=" + date2) //输出时间
  }
}

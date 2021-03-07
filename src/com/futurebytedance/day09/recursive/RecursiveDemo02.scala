package com.futurebytedance.day09.recursive

import java.text.SimpleDateFormat
import java.util.Date

import scala.annotation.tailrec

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 14:54
 * @version 1.0
 * @Description 递归
 */
object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    //递归的方式来解决
    val now = new Date()
    val dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("date=" + date) //输出时间

    //测试
    val num = BigInt(1)
    val sum = BigInt(0)
    val res1 = mx(num, sum)
    println("res1=" + res1)

    //再一次输出时间
    val now2 = new Date()
    val date2 = dateFormat.format(now2)
    println("date2=" + date2) //输出时间
  }

  @tailrec
  def mx(num: BigInt, sum: BigInt): BigInt = {
    if (num <= 99999999L) mx(num + 1, sum + num)
    else sum
  }
}

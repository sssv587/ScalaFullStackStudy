package com.futurebytedance.day03.funcdetails

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 23:18
 * @version 1.0
 * @Description
 */
object Details04 {
  def main(args: Array[String]): Unit = {
    println(sayOk("marry"))
  }

  def sayOk(name: String = "jack"): String = {
    name + "ok"
  }
}

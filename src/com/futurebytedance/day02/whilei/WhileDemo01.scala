package com.futurebytedance.day02.whilei

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:37
 * @version 1.0
 * @Description While的使用
 */
object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句 迪丽热巴
    //1.定义循环变量
    var i = 0
    //2. i < 10 条件
    while (i < 10) {
      println("迪丽热巴\t" + i)
      //循环遍历迭代
      i += 1
    }
  }
}

package com.futurebytedance.day04.constructor

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 1:32
 * @version 1.0
 * @Description
 */
object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new AA("jack")
    //输出的顺序时
    //1.BB ~~~~ 父类
    //2.AA() 主构造器
    //3.A this(name: String) 辅助构造器
  }
}

class BB {
  println("BB ~~~~")
}

class AA() extends BB(){
  println("AA()...")
  def this(name: String) {
    this //调用A的主构造器 使用this的原因是调用父类构造器
    println("AA this(name: String)")
  }
}

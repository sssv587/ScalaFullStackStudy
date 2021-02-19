package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/20 - 1:29
 * @version 1.0
 * @Description
 */
object FiledOverrideDetail02 {
  def main(args: Array[String]): Unit = {
    println("xxx")
    val bbbbb = new BBBBB
    println(bbbbb.sal) //0
    val b2: AAAAA = new BBBBB
    println("b2.sal=" + b2.sal()) //0
  }
}

class AAAAA {
  def sal(): Int = {
    10
  }
}

class BBBBB extends AAAAA {
  override val sal: Int = 0 //底层public sal
}

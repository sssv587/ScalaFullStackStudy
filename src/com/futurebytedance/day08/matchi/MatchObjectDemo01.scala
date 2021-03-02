package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/3 - 0:58
 * @version 1.0
 * @Description 模式匹配-匹配对象
 * 1)case中对象的unapply方法(对象提取器)返回Some集合则为匹配成功
 * 2)返回none集合则为匹配失败
 */
object MatchObjectDemo01 {
  def main(args: Array[String]): Unit = {
    // 模式匹配使用：
    val number: Double = 36.0
    number match {
      //说明 case Square(n) 运行的机制的说明
      //1.当匹配到case Square(n)
      //2.调用Square的unapply(z: Double)方法,z的值就是n的值
      //3.如果对象提取器unapply(z:Double)返回的是Some(6.0),则表示匹配成功，同时将6.0赋给Square(n)的n
      //如果返回的是Node，则表示匹配不成功
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }
  }
}

//说明
object Square {
  //说明
  //1.unapply方法是对象提取器
  //2.接收一个z:Double类型
  //3.返回类型是Option[Double]
  //4.返回的值是Some(math.sqrt(z)) 返回z的开平方的值，并放入到Some(x)
  def unapply(z: Double): Option[Double] = {
    println("unapply方法被调用 z是" + z)
    Some(math.sqrt(z))
  }

  def apply(z: Double): Double = z * z
}
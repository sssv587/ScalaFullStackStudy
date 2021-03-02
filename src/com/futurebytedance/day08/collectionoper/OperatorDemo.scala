package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 22:26
 * @version 1.0
 * @Description Operator-操作符
 * 1)如果想在变量名、类名等定义中使用语法关键字（保留字），可以配合反引号反引号(飘号)
 * 2)中置操作符：A 操作符 B 等同于 A.操作符(B)
 * 3)后置操作符：A操作符 等同于 A.操作符，如果操作符定义的时候不带()则调用时不能加括号
 * 4)前置操作符，+、-、！、~等操作符A等同于A.unary_操作符
 * 5)赋值操作符，A 操作符= B 等同于 A = A 操作符 B  ，比如 A += B 等价 A = A + B
 *
 */
object OperatorDemo {
  def main(args: Array[String]): Unit = {
    val `val` = 42
    println(`val`)

    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2 //3
    val r2 = n1.+(n2) // 3看Int的源码即可说明
    println("r1=" + r1 + " r2=" + r2)

    val monster = new Monster
    monster + 10
    monster.+(10)
    println("monster.money=" + monster.money)

    println(monster ++ ())
    println(monster.++())
    println("monster.money=" + monster.money)

    !monster
    println("monster.money=" + monster.money)
  }
}

class Monster {
  var money: Int = 0

  //对操作符进行后置重载(前置操作符,一元运算符)
  def unary_!(): Unit = {
    this.money = -this.money
  }

  //对操作符进行重载(中置操作符)
  def +(n: Int): Unit = {
    this.money += n
  }

  //对操作符进行后置重载(后置操作符)
  def ++(): Unit = {
    this.money += 1
  }
}
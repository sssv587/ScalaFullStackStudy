package com.futurebytedance.day03.funcdetails

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 22:59
 * @version 1.0
 * @Description
 *
 * 1) 函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
 * 2) 形参列表和返回值列表的数据类型可以是值类型和引用类型。
 * 3) Scala 中的函数可以根据函数体最后一行代码自行推断函数返回值类型。那么在这种情况下，return 关键字
 * 可以省略
 * 4) 因为 Scala 可以自行推断，所以在省略 return 关键字的场合，返回值类型也可以省略
 * 5) 如果函数明确使用 return 关键字，那么函数返回就不能使用自行推断了,这时要明确写成 : 返回类型 = ，
 * 当然如果你什么都不写，即使有 return 返回值为()
 * 6) 如果函数明确声明无返回值（声明 Unit），那么函数体中即使使用 return 关键字也不会有返回值
 * 7) 如果明确函数无返回值或不确定返回值类型，那么返回值类型可以省略(或声明为 Any)
 * 8) Scala 语法中任何的语法结构都可以嵌套其他语法结构(灵活)，即：函数/方法中可以再声明/定义函数/方法，
 * 类中可以再声明类
 * 9) Scala 函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实参，则会使
 * 用默认值。如果指定了实参，则实参会覆盖默认值
 * 10) 如果存在多个参数，每一个参数都可以设定默认值，那么这个时候，传递的参数到底是覆盖默认值，还是
 * 赋值给没有默认值的参数，就不确定了(默认按照声明顺序[从左到右])。在这种情况下，可以采用带名参数
 * 11) scala 函数的形参默认是 val 的，因此不能在函数中进行修改.
 * 12) 递归函数未执行之前是无法推断出来结果类型，在使用时必须有明确的返回值类型
 * 13) Scala 函数支持可变参数，可变参数需要写在形参列表的最后
 */
object Details01 {
  def main(args: Array[String]): Unit = {
    //形参列表和返回值的数据类型可以是值类型和引用类型
    val tiger = new Tiger
    val tiger1: Tiger = test01(10, tiger)
    println(tiger1.name) //jack
    println(tiger.name) //jack
    println(tiger.hashCode() + " " + tiger1.hashCode())
  }

  def test01(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "jack"
    tiger
  }
}

class Tiger {
  //一个名字属性
  var name = ""
}

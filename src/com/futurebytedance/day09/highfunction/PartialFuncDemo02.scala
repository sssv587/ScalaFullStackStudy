package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/4 - 23:36
 * @version 1.0
 * @Description 偏函数
 *
 * 1)使用构建特质的实现类(使用的方式是PartialFunction的匿名子类)
 * 2)PartialFunction 是个特质(看源码)
 * 3)构建偏函数时，参数形式   [Any, Int]是泛型，第一个表示传入参数类型，第二个  表示返回参数
 * 4)当使用偏函数时，会遍历集合的所有元素，编译器执行流程时先执行isDefinedAt()如果为true ,就会执行 apply, 构建一个新的Int 对象返回
 * 5)执行isDefinedAt() 为false 就过滤掉这个元素，即不构建新的Int对象.
 * 6)map函数不支持偏函数，因为map底层的机制就是所有循环遍历，无法过滤处理原来集合的元素
 * 7)collect函数支持偏函数
 */
object PartialFuncDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")
    //说明
    //定义一个偏函数
    //1.partialFunction[Any,Int] 表示偏函数接收的参数类型是Any，返回类型是Int
    //2.isDefineAt(x:Any) 如果返回是true，就会去调用apply构建对象实例，如果是false，过滤
    //3.apply 构造器，对传入的值 +1，并返回(新的集合)
    val addOne3 = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        println("x")
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
        println("v1")
        v1.asInstanceOf[Int] + 1
      }
    }

    //使用偏函数
    //说明：如果是调用偏函数，则不能使用map，应该使用collect
    //说明一下偏函数的执行流程
    //1.遍历list所有元素
    //2.然后调用 val ele = partialFunction-isDefinedAt(list的单个元素) {partialFunction-apply(list单个元素)}
    //3.每得到一个element，就放入新的集合，最后返回
    val list3 = list.collect(addOne3)
    println("list3=" + list3)
  }
}

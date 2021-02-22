package com.futurebytedance.day06.extendtrait

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 22:09
 * @version 1.0
 * @Description 特质的扩展
 * 1)所有混入该特质的类，会自动成为那个特质所继承的超类的子类
 * 2)如果混入该特质的类，已经继承了另一个类(A类)，则要求A类是特质超类的子类，否则就会出现了多继承现象，发生错误
 */
object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

//说明
//1.LoggedException继承了 Exception
//2.LoggedException特质就可以使用 Exception功能
trait LoggedException extends Exception{
  def log(): Unit ={
    println(getMessage) // 方法来自于Exception类
  }
}

//因为UnhappyException继承了LoggedException
//而LoggedException继承了Exception
//UnhappyException就是Exception的子类.
class UnhappyException extends LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

//如果混入该特质的类，已经继承了另一个类(A类)，则要求A类是特质超类的子类，否则就会出现了多继承现象，发生错误
class UnhappyException2 extends IndexOutOfBoundsException with LoggedException{
  //已经是Exception的子类了，所以可以重写方法
  override def getMessage: String = "错误消息!"
}

class CCC extends Exception{}

//错误的原因是CCC不是Exception的子类
class UnhappyException3 extends CCC with LoggedException{
  //已经是Exception的子类了，所以可以重写方法
  override def getMessage: String = "错误消息!"
}
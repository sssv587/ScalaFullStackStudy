package com.futurebytedance.day06.mixin

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 21:49
 * @version 1.0
 * @Description 特质构造顺序
 */
object MixInSeq {
  def main(args: Array[String]): Unit = {
    //这时FF是这样 形式 class FF extends EE with CC with DD
    /*
    调用当前类的超类构造器
    第一个特质的父特质构造器
    第一个特质构造器
    第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
    第二个特质构造器
    .......重复4,5的步骤(如果有第3个，第4个特质)
    当前类构造器
     */
    //1.E...
    //2.A...
    //3.B....
    //4.C....
    //5.D....
    //6.F....
    val ff1 = new FF
    println(ff1)

    println("==============================================")

    //这时我们是动态混入
    /*
    先创建对象再动态混入
    调用当前类的超类构造器
    当前类构造器
    第一个特质构造器的父特质构造器
    第一个特质构造器.
    第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
    第二个特质构造器
    .......重复5,6的步骤(如果有第3个，第4个特质)
    当前类构造器
     */
    //1.E...
    //2.K....
    //3.A...
    //4.B....
    //5.C....
    //6.D....
    val ff2 = new KK with CC with DD
    println(ff2)
  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B....")
}

trait CC extends BB {
  println("C....")
}

trait DD extends BB {
  println("D....")
}

class EE { //普通的类
  println("E...")
}

class FF extends EE with CC with DD { //先继承了EE类，然后再继承CC和DD
  println("F....")
}

class KK extends EE { //KK直接继承了普通类EE
  println("K....")
}

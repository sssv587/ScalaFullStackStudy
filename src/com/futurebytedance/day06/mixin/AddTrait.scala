package com.futurebytedance.day06.mixin

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 20:17
 * @version 1.0
 * @Description 叠加特质
 * 1)特质声明顺序从左到右。
 * 2)Scala在执行叠加对象的方法时，会首先从后面的特质(从右向左)开始执行
 * 3)Scala中特质中如果调用super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
 * 4)如果想要调用具体特质的方法，可以指定：super[特质].xxx(…).其中的泛型必须是该特质的直接超类类型
 */
object AddTrait {
  def main(args: Array[String]): Unit = {
    //说明
    //1.创建MySQL4实例时，动态的混入了DB4和File4

    //研究第一个问题，当我们创建一个动态混入对象时，其顺序是怎样的
    //总结一句话
    //Scala在叠加特质的时候，会首先从后面的特质开始执行(即从左到右)
    //1.Operator4
    //2.Data4
    //3.DB4
    //4.File4
    val mysql = new MySQL4 with DB4 with File4

    //研究第二个问题，当我们创建一个动态混入对象的方法，其顺序是怎样的
    //顺序是，(1)从右到左开始执行(2)当执行到super时，是指的左边的特质
    //(3)如果左边没有特质，则super就是父特质
    //1.向文件
    //2.向数据库
    //3.插入数据 100
    mysql.insert(100)

    println("=========================================")

    //练习题
    val mySQL = new MySQL4 with File4 with DB4
    mySQL.insert(999)
  }
}

trait Operate4 { //特点
  println("Operate4...")

  def insert(id: Int) //抽象方法
}

trait Data4 extends Operate4 { //特质，继承了Operator4
  println("Data4")

  override def insert(id: Int): Unit = { //实现/重写 Operate4的insert
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4 { //特质，继承了Data4
  println("DB4")

  override def insert(id: Int): Unit = { //实现/重写 Data4的insert
    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends Data4 { //特质，继承Data4
  println("File4")

  override def insert(id: Int): Unit = {
    println("向文件")
    //super.insert(id)//调用了insert方法(难点),这里super在动态混入时，不一定是父类
    //如果我们希望直接调用Data4的insert方法，可以指定，如下
    //说明：super[?]的类型必须是当前的特质的直接父特质(超类)
    super[Data4].insert(id)
  }
}

class MySQL4 {} //普通类

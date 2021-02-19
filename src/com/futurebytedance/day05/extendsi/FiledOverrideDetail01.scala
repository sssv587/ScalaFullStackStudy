package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/20 - 1:23
 * @version 1.0
 * @Description 覆写字段的注意事项和细节
 * 1)def只能重写另一个def(即：方法只能重写另一个方法)
 * 2)val只能重写父类的一个val属性 或 父类的不带参数的def方法
 * 3)var只能重写另一个抽象的var属性
 *
 */
object FiledOverrideDetail01 {
  def main(args: Array[String]): Unit = {
    println("xxxx")
    val bbbb = new BBBB
    //bbbb.name="jack" 相当于调用了父类的name_$eq()
    //println(bbbb.name) 相当于调用了子类的 name()
    //这样出现数据设置和数据获取不一致
  }
}

class AAAA {
//  var name: String = "" //底层会生成 public name() 和 public name$_eq()
  val name: String = "" //底层会生成 public name()
}

class BBBB extends AAAA {
  override val name: String = "jj" //底层会生成 public name()
}


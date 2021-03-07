package com.futurebytedance.day10.customercrm.bean

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 20:39
 * @version 1.0
 * @Description Customer编写
 */
class Customer {
  //属性
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var telephone: String = _
  var email: String = _

  //设计一个辅助构造器
  def this(name: String, gender: Char, age: Short, telephone: String, email: String) {
    this()
    this.name = name
    this.gender = gender
    this.age = age
    this.telephone = telephone
    this.email = email
  }

  def this(id: Int, name: String, gender: Char, age: Short, telephone: String, email: String) {
    this(name, gender, age, telephone, email)
    this.id = id
  }

  override def toString: String = {
    this.id + "\t\t\t" + this.name + "\t\t\t" + this.gender + "\t\t\t" + this.age + "\t\t\t" + this.telephone + "\t\t\t" + this.email
  }
}

package com.futurebytedance.day10.customercrm.service

import com.futurebytedance.day10.customercrm.bean.Customer

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 20:49
 * @version 1.0
 * @Description
 */
class CustomerService {
  var customerNo = 5

  //customers是存放客户的，这里我们先初始化，为了测试
  val customers: ArrayBuffer[Customer] = ArrayBuffer[Customer](
    new Customer(1, "tom", '男', 10, "110", "tom@sohu.com"),
    new Customer(2, "jerry", '男', 30, "110", "jerry@sohu.com"),
    new Customer(3, "jack", '男', 40, "110", "jack@sohu.com"),
    new Customer(4, "micheal", '男', 50, "110", "micheal@sohu.com"))

  //显示客户
  def list(): ArrayBuffer[Customer] = {
    customers
  }

  //添加客户
  def add(customer: Customer): Boolean = {
    //设置id
    customerNo += 1
    customer.id = customerNo
    //加入到customers
    customers.append(customer)
    true
  }

  def del(id: Int): Boolean = {
    val index = findIndexById(id)
    if (index != -1) {
      //删除
      customers.remove(index)
      true
    } else {
      false
    }
  }

  //根据id找到index
  def findIndexById(id: Int): Int = {
    var index = -1 //默认-1，如果找到就改成对应的，如果没有找到，就返回-1
    //遍历customers
    breakable {
      for (i <- customers.indices) {
        if (customers(i).id == id) { //找到
          index = i
          break
        }
      }
    }
    index
  }

  //修改
  def modify(id: Int, name: String, gender: Char, age: Short, telephone: String, email: String): Unit = {
    val index = searchById(id)
    if (searchId(id)) {
      customers(index).name = name
      customers(index).gender = gender
      customers(index).age = age
      customers(index).telephone = telephone
      customers(index).email = email
    }
  }

  def searchId(id: Int): Boolean = {
    val index = searchById(id)
    if (index != -1) {
      true
    } else {
      false
    }
  }

  def listById(id: Int): Any = {
    val index = searchById(id)
    if (index == -1) {
    } else {
      customers(index)
    }
  }

  def listByName(name: String): Any = {
    val nameCustomers = searchByName(name)
    if (nameCustomers.isEmpty) {

    } else {
      nameCustomers
    }
  }

  //按名称查找
  def searchByName(name: String): ArrayBuffer[Customer] = {
    val customersByName: ArrayBuffer[Customer] = ArrayBuffer[Customer]()
    for (i <- customers.indices) {
      if (customers(i).name.contains(name)) {
        customersByName.append(customers(i))
      }
    }
    customersByName
  }

  //按编号查找
  def searchById(id: Int): Int = {
    var index = -1
    breakable {
      for (i <- customers.indices) {
        if (customers(i).id == id) {
          index = i
          break()
        }
      }
    }
    index
  }
}

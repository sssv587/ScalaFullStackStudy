package com.futurebytedance.day10.customercrm.view

import com.futurebytedance.day10.customercrm.bean.Customer
import com.futurebytedance.day10.customercrm.service.CustomerService

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 20:49
 * @version 1.0
 * @Description
 */
class CustomerView {
  //定义一个循环变量，控制是否退出while
  var loop = true
  //定义一个key用于接收用户输入的选项
  var key = ' '

  private val customerService: CustomerService = new CustomerService

  /*
    -----------------客户信息管理软件-----------------

                    1 添 加 客 户
                    2 修 改 客 户
                    3 删 除 客 户
                    4 客 户 列 表
                    5 退      出

                    请选择(1-5)：_

     */
  def mainMenu(): Unit = {
    do {
      println("-----------------客户信息管理软件-----------------")
      println("                 1 添 加 客 户")
      println("                 2 修 改 客 户")
      println("                 3 删 除 客 户")
      println("                 4 按名称查找客户")
      println("                 5 按ID查找客户")
      println("                 6 客 户 列 表")
      println("                 7 退       出")
      println("请选择(1-5)：")
      key = StdIn.readChar()
      key match {
        case '1' => this.add()
        case '2' => this.modify()
        case '3' => this.del()
        case '4' => this.listByName()
        case '5' => this.listById()
        case '6' => this.list()
        case '7' => this.loop = false
      }
    } while (loop)
  }

  //增
  def add(): Unit = {
    println()
    println("---------------------添加客户---------------------")
    println("姓名：")
    val name = StdIn.readLine()
    println("性别：")
    val gender = StdIn.readChar()
    println("年龄：")
    val age = StdIn.readShort()
    println("电话：")
    val telephone = StdIn.readLine()
    println("邮箱：")
    val email = StdIn.readLine()
    //构建对象
    val customer = new Customer(name, gender, age, telephone, email)
    customerService.add(customer)
    println("---------------------添加完成---------------------")
  }

  //查
  def list(): Unit = {
    println()
    println("---------------------------客户列表---------------------------")
    println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
    //for遍历
    //1.获取到CustomerService 的 customers ArrayBuffer
    val customers = customerService.list()
    for (customer <- customers) {
      //重写Customer的toString方法，返回信息(并且格式化)
      println(customer)
    }
    println("-------------------------客户列表完成-------------------------")
  }

  //修改
  def modify(): Unit = {
    println("请输入需要修改的用户编号:")
    val index = StdIn.readInt()
    val flag: Boolean = customerService.searchId(index)
    if (!flag) {
      println("找不到该人，无法修改!")
    } else {
      println("姓名：")
      val name = StdIn.readLine()
      println("性别：")
      val gender = StdIn.readChar()
      println("年龄：")
      val age = StdIn.readShort()
      println("电话：")
      val telephone = StdIn.readLine()
      println("邮箱：")
      val email = StdIn.readLine()
      customerService.modify(index, name, gender, age, telephone, email)
      println("修改成功!")
    }
  }

  //按编号查
  def listById(): Unit = {
    println("请输入要查找的用户编号:")
    val index = StdIn.readInt()
    val customer = customerService.listById(index)
    customer match {
      case i: Customer => println(i)
      case _ => println("未查找到!")
    }
  }

  //按名称查
  def listByName(): Unit = {
    println("请输入要查找的名称:")
    val name = StdIn.readLine()
    val names = customerService.listByName(name)
    names match {
      case i: ArrayBuffer[Customer] =>
        for (customer <- i) {
          println(customer)
        }
      case _ => println("未找到!")
    }
  }

  /*
  ---------------------删除客户---------------------
  请选择待删除客户编号(-1退出)：1
  确认是否删除(Y/N)：y
  ---------------------删除完成---------------------
 */
  def del(): Unit = {
    println("---------------------删除客户---------------------")
    println("请选择待删除客户编号(-1退出)：")
    val id = StdIn.readInt()
    if (id == -1) {
      println("---------------------删除没有完成---------------------")
      return
    }
    println("确认是否删除(Y/N)：")

    //要求用户在退出时提示 " 确认是否退出(Y/N)："，用户必须输入y/n, 否则循环提示
    var choice = ' '
    breakable {
      do {
        choice = StdIn.readChar().toLower
        if (choice == 'y' || choice == 'n') {
          break()
        }
        println("确认是否删除(Y/N)：")
      } while (true)
    }

    if (choice == 'y') {
      if (customerService.del(id)) {
        println("---------------------删除完成---------------------")
        return
      }
    }
    println("---------------------删除没有完成---------------------")
  }
}

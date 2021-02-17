package com.futurebytedance.day04.abstracti

/**
 * @author yuhang.sun
 * @date 2021/2/18 - 1:16
 * @version 1.0
 * @Description
 */
object BankDemo {
  def main(args: Array[String]): Unit = {
    //开卡
    val account = new Account("gh00001", 849.0, "111111")
    account.query("111111")
    account.withDraw("111111", 100.0)
    account.query("111111")
  }
}

//编写一个Account类
class Account(inAccount: String, inBalance: Double, inPwd: String) {
  val accountNo: String = inAccount
  var balance: Double = inBalance
  var pwd: String = inPwd

  //查询
  def query(pwd: String): Unit = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    printf("账号为%s 当前余额为%.2f", this.accountNo, this.balance)
    println()
  }


  //取款
  def withDraw(pwd: String, money: Double): Any = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    if (this.balance < money) {
      println("余额不足")
      return
    }
    this.balance -= money
    money
  }
}

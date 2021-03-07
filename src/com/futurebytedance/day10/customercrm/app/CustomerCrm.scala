package com.futurebytedance.day10.customercrm.app

import com.futurebytedance.day10.customercrm.view.CustomerView

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 20:56
 * @version 1.0
 * @Description
 */
object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}

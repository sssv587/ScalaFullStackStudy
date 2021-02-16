package com.futurebytedance.day04.javapackage;

import com.futurebytedance.day04.javapackage.xm.Tiger;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/17 - 3:31
 * @Description
 */
public class TestTiger {
    public static void main(String[] args) {
        //使用xm的Tiger
        com.futurebytedance.day04.javapackage.xm.Tiger tiger01 = new com.futurebytedance.day04.javapackage.xm.Tiger();

        //使用xh的Tiger
        com.futurebytedance.day04.javapackage.xh.Tiger tiger02 = new com.futurebytedance.day04.javapackage.xh.Tiger();

        System.out.println("tiger01=" + tiger01 + " tiger02" + tiger02);
    }
}

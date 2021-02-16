package com.futurebytedance.day04.constructor;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/17 - 1:43
 * @Description
 */
public class JavaDemo01 {
    public static void main(String[] args) {

    }
}

class AAA {
    public AAA() {
        //这里调用AAA(String name)
        //super();
        this("aaa");
        System.out.println("AAA()");
    }

    public AAA(String name) {
        super();
    }
}

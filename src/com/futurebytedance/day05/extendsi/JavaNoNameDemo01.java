package com.futurebytedance.day05.extendsi;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/21 - 0:08
 * @Description
 */
public class JavaNoNameDemo01 {
    public static void main(String[] args) {
        A2 a2 = new A2() {
            @Override
            public void cry() {
                System.out.println("cry...");
            }
        };
        a2.cry();
    }
}

abstract class A2 {
    abstract public void cry();
}

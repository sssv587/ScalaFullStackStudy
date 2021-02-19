package com.futurebytedance.day05.extendsi;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/20 - 0:56
 * @Description
 */
public class JavaFieldOverride {
    public static void main(String[] args) {
        //创建两个对象
        //下面的代码小结
        //1.对于同一个对象，用父类的引用去取值(字段),会取到父类的字段的值
        //2.用子类的引用去取值(字段),则取到子类字段的值
        Sub2 c1 = new Sub2();
        System.out.println(c1.s);//Sub

        System.out.println(((Super2) c1).s); //通过强转，仍然可以访问到被隐藏的字段

        Super2 c2 = new Sub2();
        System.out.println(c2.s);//Super
    }
}

class Super2 {
    String s = "super";
}

class Sub2 extends Super2 {
    String s = "sub";
}
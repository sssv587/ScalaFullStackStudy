package com.futurebytedance.day03.exceptioni;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/16 - 2:35
 * @Description
 */
public class JavaExceptionDemo01 {
    public static void main(String[] args) {
        try {
            //可疑代码
            int i = 0;
            int b = 10;
            int c = b / i; //执行代码时，会抛出ArithmeticException异常
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (Exception e) { //java中不能把异常大的写在异常小的前面
            e.printStackTrace();
        } finally {
            //最终要执行的代码
            System.out.println("java finally");
        }
    }
}

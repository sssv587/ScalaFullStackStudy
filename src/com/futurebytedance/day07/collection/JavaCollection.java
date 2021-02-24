package com.futurebytedance.day07.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/25 - 0:16
 * @Description
 */
public class JavaCollection {
    public static void main(String[] args) {
        //不可变集合类似java的数组
        int[] nums = new int[3];
        nums[2] = 11; //可以修改值
        //nums[3] = 90; 不能动态增长，因为是不可以变的.

        String[] names = {"bj", "sh"};
        System.out.println(Arrays.toString(nums) + " " + Arrays.toString(names));

        //可变集合举例
        ArrayList<String> al = new ArrayList<>();
        al.add("zs");
        al.add("zs2");
        System.out.println(al + " " + al.hashCode()); //地址
        al.add("zs3");
        System.out.println(al + " " + al.hashCode()); //地址变化
    }
}

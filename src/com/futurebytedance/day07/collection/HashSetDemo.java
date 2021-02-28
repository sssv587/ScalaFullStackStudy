package com.futurebytedance.day07.collection;

import java.util.HashSet;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/28 - 21:36
 * @Description
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //java中的set的元素 没有顺序、不能重复
        HashSet<String> hs = new HashSet<>();
        hs.add("jack");
        hs.add("tom");
        hs.add("jack");
        hs.add("jack2");
        System.out.println(hs);
    }
}

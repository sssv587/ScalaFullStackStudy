package com.futurebytedance.day07.collection;

import java.util.HashMap;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/2/28 - 20:27
 * @Description
 */
public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("no1", 100);
        hm.put("no2", 200);
        hm.put("no3", 300);
        hm.put("no4", 400);

        System.out.println(hm);
        System.out.println(hm.get("no2"));
    }
}

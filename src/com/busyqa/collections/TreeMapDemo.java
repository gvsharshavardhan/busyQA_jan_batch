package com.busyqa.collections;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, Object> tm = new TreeMap<>();
        tm.put("abc",12);
        tm.put("xyz",112);
        tm.put("lmn","qa");
        System.out.println(tm);
    }
}

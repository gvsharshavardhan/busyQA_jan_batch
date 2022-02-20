package com.busyqa.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProblemsWithArrays {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        String[] names = {"abc","xyz","lmn"};
//        Integer[] marks2 = new Integer[6];
//
//        Object[] mixture = new Object[5];
//        mixture[0] = 10;
//        mixture[1] = 10.89;
//        mixture[2] = 10.89f;
//        mixture[3] = false;
//        mixture[4] = "busyqa";

        ArrayList al = new ArrayList();
        al.add("busyqa");
        al.add(false);
        al.add(24);
        al.add(24.67);
        al.add(24.67f);
        System.out.println(al);
        al.add("thomas");
        al.add("gopika");

        al.add("thomas");
        System.out.println(al);
        al.remove(3);
        al.remove("busyqa");
        System.out.println(al);
        Object o = al.set(4,"ni");
        System.out.println(al);
        System.out.println(o);
        System.out.println(al.size());

        System.out.println(al.contains("harsha"));
        System.out.println(al.contains("thomas"));

        for(Object a:al){
            System.out.println(a);
        }
        al.get(4);



    }
}

package com.assignments.assignment1;

public class Fibinocci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21  34 55
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        while(true){
            int temp = a+b;
            if (temp>1000){break;}
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
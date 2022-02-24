package com.assignments.assignment1;

import java.util.Scanner;

public class ReverseANumUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int num = sc.nextInt();
        int revnum = 0;
        while(num!=0){
            int r = num%10;
            num=num/10;
            revnum = revnum*10+r;
        }
        System.out.println("rev num: "+ revnum);
        //123
        //3*10 + 2->32
        //32*10 + 1->321
    }
}
package com.assignments.assignment1;

import java.util.Scanner;

public class PalindromeNUmber {
    static int revnum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int num = sc.nextInt();
        int num1 = num;

        while(num!=0){
            int r = num%10;
            num=num/10;
            revnum = revnum*10+r;
        }
        System.out.println("rev num: "+ revnum);
        System.out.println(num1 +" : "+ revnum);

        if(revnum != num1){
            System.out.println("is not a palindrome!!");
        }else{
            System.out.println("is palindrome!!");
        }
    }
}

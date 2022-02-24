package com.assignments.assignment1;

import java.util.Scanner;

public class DigitsCountInANumber {
    public static void main(String[] args) {
        //99988645677
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
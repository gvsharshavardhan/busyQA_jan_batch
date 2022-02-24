package com.assignments.assignment1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a num: ");
        int num = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num + " * "+i+" = "+(num*i));
        }
        //2 * 1 = 2
        //2 * 2 = 4
        //2 * 3 = 6
    }
}

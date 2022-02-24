package com.assignments.assignment1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();

        if(input>0){
            System.out.println(input + " is a +ve number!!");
        }else if(input<0){
            System.out.println(input + " is a -ve number!!");
        }else{
            System.out.println(input + " is neither -ve nor +ve!!");
        }
    }
}
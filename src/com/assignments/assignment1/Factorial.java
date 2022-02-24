package com.assignments.assignment1;

public class Factorial {

    public static void main(String[] args) {
        int a = 6;
        int op = 1;
        for(int i = a;i>=1;i--){
            op = op * i;
        }
        System.out.println(op + " is the factorial of " + a);
    }
}
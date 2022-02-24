package com.assignments.assignment1;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("\nEnter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("\nEnter 3rd number: ");
        int c = sc.nextInt();
        int largestNum = 0;

        if (a > b && a > c) {
            largestNum = a;
        } else if (b > a && b > c) {
            largestNum = b;
        } else {
            largestNum = c;
        }

        System.out.println("Largest num is: " + largestNum);
    }
}
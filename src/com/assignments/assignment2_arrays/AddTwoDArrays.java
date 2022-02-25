package com.assignments.assignment2_arrays;

import java.util.Scanner;

public class AddTwoDArrays {
    public static void main(String[] args) {
        int[][] marks1 = new int[3][3];
        int[][] marks2 = new int[3][3];
        int[][] total = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks1.length; i++) {
            for (int j = 0; j < marks1[i].length; j++) {
                System.out.print("enter value of marks1 at " + i + ":" + j + " =>");
                marks1[i][j] = sc.nextInt();
                System.out.print("enter value of marks2 at " + i + ":" + j + " =>");
                marks2[i][j] = sc.nextInt();
                total[i][j] = marks1[i][j] + marks2[i][j];
            }
        }
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[i].length; j++) {
                System.out.print(total[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
package com.busyqa.java;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 50;
        marks[4] = 988;
        int[] marks2 = Arrays.copyOf(marks,marks.length);
        marks2[3] = 67;
        System.out.println("marks2:");
        for (int mark: marks2) {
            System.out.print(mark + "\t");
        }
        System.out.println("\nmarks 1:");
        for (int mark: marks) {
            System.out.print(mark + "\t");
        }

    }
}

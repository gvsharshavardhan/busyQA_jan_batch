package com.assignments.assignment2;

public class TwoDArraySum {
    public static void main(String[] args) {
        int[][] marks = new int[2][3];
        marks[0][0] = 20;
        marks[0][1] = 30;
        marks[0][2] = 40;
        marks[1][0] = 25;
        marks[1][1] = 45;
        marks[1][2] = 35;

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total = total + marks[i][j];
            }
            System.out.println("total of student " + (i + 1) + " : " + total);
            System.out.println("average of student " + (i + 1) + " : " + (double) total / marks[i].length);
        }
    }
}
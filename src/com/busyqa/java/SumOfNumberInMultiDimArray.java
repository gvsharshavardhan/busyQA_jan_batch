package com.busyqa.java;

public class SumOfNumberInMultiDimArray {

    public static void main(String[] args) {
        int[][] marks = new int[2][5];
        int counter = 1;
        for (int r = 0; r < marks.length; r++) {
            for (int c = 0; c < marks[r].length; c++) {
                marks[r][c] = counter;
                counter++;
            }
        }
        int total = 0;
        for (int[] mark : marks) {
            for (int x : mark) {
                System.out.print(x+"\t");

                total = total + x;
            }
            System.out.println();
        }
        System.out.println("total: " + total);
    }
}

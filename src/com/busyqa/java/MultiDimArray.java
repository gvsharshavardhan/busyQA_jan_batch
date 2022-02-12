package com.busyqa.java;

public class MultiDimArray {

    public static void main(String[] args) {
        int counter = 0;
        int[][] marks = new int[3][4];
       for(int i =0;i<marks.length;i++){
           for(int j = 0;j<marks[i].length;j++){
               counter ++;
               marks[i][j] = counter;
           }
       }
       for(int[] mark:marks){
           for(int x:mark){
               System.out.print(x+"\t");
           }
           System.out.println();
       }
    }
}

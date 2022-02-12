package com.assignments.assignment2;

public class MissingNumberInAnArray {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,6,8,12};

        int[] modifiedArray = {6,8,3,2};

        boolean flag = false;

        for(int i : myArray){
            for(int j : modifiedArray){
                flag = i==j;
                if(flag){
                    break;
                }
            }
            if(!flag){
                System.out.println("Missing number is: " + i);
            }
        }
    }
}
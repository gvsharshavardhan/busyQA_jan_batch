package com.assignments.assignment2;

import java.util.Arrays;

public class SumAvgEvenOddFromArray {

    public static void main(String[] args) {
        int[] numbers = {1,4,5,6,9,12,14};
        int sum = 0;
        int[] evenNumbers = new int[numbers.length];
        int[] oddNumbers = new int[numbers.length];
        int i = 0;
        int j = 0;
        for(int x : numbers){
            if(x%2==0){
                evenNumbers[i]=x;
                i++;
            }else{
                oddNumbers[j]=x;
                j++;
            }
            sum = sum + x;
        }
        System.out.println("sum is : " + sum);
        System.out.println("avg is : " + (double)sum/numbers.length);
        //we cannot print arrays directly.
        //we have loop over arrays and print each element (or)
        //Arrays.toString(arrayVarName)
        System.out.println("odd numbers: " + Arrays.toString(oddNumbers));
        System.out.println("even numbers: " +Arrays.toString(evenNumbers));
    }
}
package com.assignments.assignment2;

public class LargestAndSmallestInAnArray {
    public static void main(String[] args) {
        int[] nums = {312, 100, 13, 7, 15};
        int largestNum = nums[0], smallestNum = nums[0];

        for (int x : nums) {
            if (x > largestNum) {
                largestNum = x;
            } else if (x < smallestNum) {
                smallestNum = x;
            }
        }
        System.out.println("largest num: " + largestNum + "\nsmallest num: " + smallestNum);
    }
}
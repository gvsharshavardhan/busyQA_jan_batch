package com.assignments.assignment2_strings;

public class EachCharacterOccuranceInAString {
    public static void main(String[] args) {
        String name = "selenium";
        char[] nameArray = name.toCharArray();

        int[] asciiArray = new int[127];
        for (int i = 0; i < nameArray.length; i++) {
            int ch = nameArray[i];
            asciiArray[ch] = asciiArray[ch] + 1;
        }

        for (int i = 0; i < asciiArray.length; i++) {
            if (asciiArray[i] > 0) {
                System.out.println((char) i + " : " + asciiArray[i]);
            }
        }
    }
}

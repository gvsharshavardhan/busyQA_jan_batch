package com.assignments.assignment2_strings;

public class ReverseUpperLower {
    public static void main(String[] args) {
        /**
         String name = "BUSYQA";
         String name2 = "selenium";

         System.out.println(name.toLowerCase());
         System.out.println(name2.toUpperCase());
         **/

        //reverse
        //busyqa -> aqysub

        String name = "tenet";
        char[] nameArray = name.toCharArray();
        int length = name.length();
        //busyqa

        for (int i = 0; i < length / 2; i++) {
            char temp = nameArray[i];
            nameArray[i] = nameArray[length - 1 - i];
            nameArray[length - 1 - i] = temp;
        }
        if (new String(nameArray).equals(name)) {
            System.out.println("strings are palindrome!");
        } else {
            System.out.println("not palindrome!");
        }
    }
}
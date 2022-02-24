package com.assignments.assignment2_strings;

public class StringtoIntAndViceVersa {
    public static void main(String[] args) {
        int num = 89098;
        String phnum = "567988888889";
        String n = String.valueOf(num);
        System.out.println(n instanceof String);
        Long i = Long.parseLong(phnum);
        System.out.println(i+1);
    }
}

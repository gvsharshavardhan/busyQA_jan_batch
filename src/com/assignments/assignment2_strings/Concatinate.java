package com.assignments.assignment2_strings;

public class Concatinate {
    public static void main(String[] args) {
        String message = "HI";
        String name = " john";
        System.out.println(message+name);
        String fullmessage = message.concat(name);
        System.out.println(fullmessage);

        System.out.println(name.length());
    }
}
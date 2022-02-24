package com.assignments.assignment2_strings;

public class WordCountInASentence {
    public static void main(String[] args) {
        String str = "hi      im   busy teaching selenium java";
        System.out.println(str.split("\\s+").length);
    }
}

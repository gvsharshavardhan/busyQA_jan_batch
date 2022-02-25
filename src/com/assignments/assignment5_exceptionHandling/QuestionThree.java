package com.assignments.assignment5_exceptionHandling;

public class QuestionThree {
    public static void main(String[] args) {

        int age = 4;

        if (age > 18) {
            throw new AgeExceedException("age is above 18!!");
        } else {
            System.out.println("you can come inside!!");
        }
    }
}
package com.assignments.assignment5_exceptionHandling;

public class QuestionTwo {
    public static void main(String[] args) throws InterruptedException {
        test();

    }

    static void test() throws InterruptedException{
            throw new InterruptedException();
    }
}
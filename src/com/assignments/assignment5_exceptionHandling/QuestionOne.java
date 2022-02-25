package com.assignments.assignment5_exceptionHandling;

public class QuestionOne {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int marks[] = null;
        String colors[] = {"blue","white","red","green"};

        try {
            System.out.println(a / b);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        finally {
            System.out.println("arthimetic exception finally block!!");
        }

        try {
            System.out.println(marks.length);
        }
        catch (NullPointerException npe){
            System.out.println(npe);
        }finally {
            System.out.println("i'm inside npe finally block!!");
        }

        try {
            System.out.println(colors[100]);
        }
        catch (ArrayIndexOutOfBoundsException aiofb){
            System.out.println(aiofb);
        }
    }
}
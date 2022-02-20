package com.busyqa.ExceptionsDemo;

public class ExceptionExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] marks = {1,2,3};
        try{
            System.out.println(a/b);
            System.out.println(marks[100]);
        }

        catch (ArithmeticException  ae){
            System.out.println(ae);
        }
        catch(IndexOutOfBoundsException ie){
            System.out.println(ie);
        }
        catch(RuntimeException re){
            System.out.println(re);
        }

        finally {
            System.out.println("inside finally!!");
        }

    }
}
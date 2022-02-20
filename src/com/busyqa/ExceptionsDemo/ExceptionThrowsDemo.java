package com.busyqa.ExceptionsDemo;

public class ExceptionThrowsDemo {
    public static void main(String[] args) {
        int age = 15;

        if(age<18){
            try {
                throw new AgeRestrictionException("age should be > than 18!!");
            }
            catch (Throwable te){
                System.out.println(te);
            }
        }

    }
}

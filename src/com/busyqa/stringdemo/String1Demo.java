package com.busyqa.stringdemo;


public class String1Demo {

    public static void main(String[] args) {
        String str = "harsha vardhan";
        char[] revStr = new char[str.length()];
        for (int i = str.length()-1; i >=0; i--) {
            revStr[str.length()-1-i] = str.charAt(i);
        }
        System.out.println(revStr);
    }
}
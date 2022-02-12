package com.busyqa.java;

import java.util.Scanner;

public class LoopsDemo {

    public static void main(String[] args) {

        String myusername = "abcd";
        String mypassword = "pass";

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter username: ");
        String console_username = scan.nextLine();
        System.out.print("please enter password: ");
        String console_password = scan.nextLine();

        boolean flag = console_username.equals(myusername) && console_password.equals(mypassword);
        int count = 1;

        while(!flag){
            System.out.println("Invalid credentials!!");

            System.out.print("please enter username: ");
            console_username = scan.nextLine();
            System.out.print("please enter password: ");
            console_password = scan.nextLine();
            flag = console_username.equals(myusername) && console_password.equals(mypassword);
            count++;

        }
        System.out.println("finally you got your credentials right in "+count+" attempt!!");
    }
}
package com.assignments.assignment1;

import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a month name: ");
        String month = sc.nextLine();

        switch (month){
            case "jan":
            case "mar":
            case "may":
            case "july":
            case "aug":
            case "oct":
            case "dec":
                System.out.println("31 days in a month!!");
                break;
            case "april":
            case "june":
            case "sept":
            case "nov":
                System.out.println("30 days in a month!!");
                break;
            case "feb":
                System.out.println("28 days or 29 days(leap year)!!");
                break;
            default:
                System.out.println("please enter valid month name!!");
        }
    }
}

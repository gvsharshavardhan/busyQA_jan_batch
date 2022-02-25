package com.assignments.assignment4_inheritance;

public class ComputerTeacher extends Teacher {

    public static void main(String[] args) {
        ComputerTeacher ct = new ComputerTeacher();
        System.out.println(ct.collegeName);
        ct.does();
        System.out.println(ct.designation);
    }
}
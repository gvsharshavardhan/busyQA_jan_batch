package com.assignments.assignments3;

public class Calculation {
    int a;
    int b;
    int c;

    Calculation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int sum() {
        return this.a + this.b + this.c;
    }

    public static void main(String[] args) {
        Calculation cal = new Calculation(12, 56, 45);
        int total = cal.sum();
        System.out.println("total : " + total);
    }
}
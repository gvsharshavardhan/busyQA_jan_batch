package com.assignments.assignments3;

public class CalculationPro {

    int sum(int x, int y) {
        return x + y;
    }

    int sum(int x, int y, int z) {
        return x + y + z;
    }

    double sum(double x, double y) {
        return x + y;
    }

    double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        CalculationPro calpro = new CalculationPro();
        int total1 = calpro.sum(2, 3);
        int total2 = calpro.sum(2, 3, 8);
        double total3 = calpro.sum(2.7, 3.8);
        double total4 = calpro.sum(2.6, 3.34, 8.7);

        System.out.println("total 1: " + total1);
        System.out.println("total 2: " + total2);
        System.out.println("total 3: " + total3);
        System.out.println("total 4: " + total4);
    }
}
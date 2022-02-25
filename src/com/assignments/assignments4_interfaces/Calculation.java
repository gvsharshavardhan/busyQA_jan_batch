package com.assignments.assignments4_interfaces;

public class Calculation implements X, Y {
    @Override
    public void add() {
        System.out.println("add : " + (a + b));
    }

    @Override
    public void mul() {
        System.out.println("Mul: " + (i * j));
    }

    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.add();
        cal.mul();
    }
}

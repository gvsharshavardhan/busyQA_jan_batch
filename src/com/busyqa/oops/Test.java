package com.busyqa.oops;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Appartment a1 = new Appartment("master bedroom","sea side balcony");
        Appartment a2 = new Appartment("small bedroom","road side balcony");

        a1.fridge = "Samsung";

        System.out.println(a1.OnFridge());
        System.out.println(a2.OnFridge());

        Appartment.OnFridge();

    }
}

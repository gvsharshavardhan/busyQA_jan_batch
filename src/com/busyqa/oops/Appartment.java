package com.busyqa.oops;

public class Appartment {

    static String fridge = "LG";
    String bedroom;
    String balcony;

    Appartment(String bedroom, String balcony){
        this.balcony = balcony;
        this.bedroom = bedroom;
    }

    static String OnFridge(){
        return fridge +" is on!";
    }

    void goToBalcony(){
        System.out.println(this.balcony + " view is good!");
    }

    void onLightInBedroom(){
        System.out.println(this.bedroom + " light is on!");
    }

}

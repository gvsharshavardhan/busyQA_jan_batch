package com.busyqa.thisdemo;

public class Parent {

    public String name;
    public int age;

    Parent(int age){
        this(age, "harsha");
    }
    Parent(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name +" : "+ this.age;
    }
}

package com.busyqa.accessModifiers;

public class SonyMax extends Sony{

    public int age;

    SonyMax(String name, int age){
        super(name);
        this.age = age;

    }
    public void run(){
        super.run();
        System.out.println("run from sonymax");
    }


}

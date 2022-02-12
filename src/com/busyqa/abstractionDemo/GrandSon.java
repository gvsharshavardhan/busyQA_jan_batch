package com.busyqa.abstractionDemo;

public class GrandSon extends Son{
    @Override
    public void constructRooms() {
        System.out.println("4000 rooms");
    }

    @Override
    void constructPool() {
        System.out.println("big pool");
    }
}

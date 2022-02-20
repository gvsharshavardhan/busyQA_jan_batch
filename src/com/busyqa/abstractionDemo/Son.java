package com.busyqa.abstractionDemo;

public class Son implements BuildingTemplate{
    @Override
    public void constructFoundation(String sand) {
        System.out.println("i require 10kg of " + sand );
    }

    @Override
    public void constructPillars(String iron) {
        System.out.println("100kg of " + iron );
    }

    @Override
    public void constructRooms() {

    }

    void constructPool(){
        System.out.println("hi");
    }

}

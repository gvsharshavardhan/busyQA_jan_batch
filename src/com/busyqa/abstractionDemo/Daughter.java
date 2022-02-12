package com.busyqa.abstractionDemo;

public class Daughter implements BuildingTemplate{
    @Override
    public void constructFoundation(String sand) {
        System.out.println("sand " + sand);
    }

    @Override
    public void constructPillars(String iron) {
        System.out.println("iron" + iron);
    }

    @Override
    public void constructRooms() {
        System.out.println("roomsss");
    }
}

package com.busyqa.abstractionDemo;

public class Test {

    public static void main(String[] args) {
        String ip = "son";
        BuildingTemplate bt;

        if(ip.equals("son")){
            bt = new Son();
        }else{
            bt = new Daughter();
        }


        bt.constructFoundation("red sand");
        bt.constructPillars("top quality iron");
        bt.constructRooms();
    }
}

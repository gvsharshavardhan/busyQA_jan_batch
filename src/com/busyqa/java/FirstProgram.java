package com.busyqa.java;

public class FirstProgram {

    public static void main(String[] args) {

      String day = "wed";

      switch (day) {
          default:
              System.out.println("relax!!");
          case "mon":
              System.out.println("learn java");
          case "tue":
              System.out.println("lern selenium");
              break;
          case "sun":
              System.out.println("watch a movie!");
              break;
      }
    }
}
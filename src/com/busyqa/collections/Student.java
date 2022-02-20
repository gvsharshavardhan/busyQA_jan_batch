package com.busyqa.collections;

public class Student {

    int mathMarks, phyMarks, cheMarks;
    String name;

    Student(String name, int mathMarks, int phyMarks, int cheMarks){
        this.name = name;
        this.mathMarks = mathMarks;
        this.phyMarks = phyMarks;
        this.cheMarks = cheMarks;
    }

    public double getAverage(){
        return (this.cheMarks + this.phyMarks + this.mathMarks)/3.0;
    }

    public String toString(){
        return this.name;
    }
}

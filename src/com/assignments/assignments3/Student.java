package com.assignments.assignments3;

public class Student {

    //field variables -> object level variables
    int SID;
    String sname;
    double sub1;
    double sub2;
    double sub3;

    //instance methods//object level methods
    void setStudentData(String sname, int SID) {
        this.sname = sname;
        this.SID = SID;
    }

    void setStudentMarks(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    void printTotalMarks() {
        System.out.println("name: " + this.sname + "\nSID: " + this.SID);
        System.out.println("Total marks: " + (this.sub1 + this.sub2 + this.sub3));
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.setStudentData("JOHN",101);
        stu2.setStudentData("DAVID",102);

        stu1.setStudentMarks(24,45,65);
        stu2.setStudentMarks(45.3,65.9,12.78);

        stu1.printTotalMarks();
        stu2.printTotalMarks();
    }
}
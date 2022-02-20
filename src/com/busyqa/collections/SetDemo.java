package com.busyqa.collections;

import java.util.ArrayList;

public class SetDemo {

    public static void main(String[] args) {
        Student s1 = new Student("Thomas",100, 200, 300);
        Student s2 = new Student("Renu",150, 250, 350);
        Student s3 = new Student("Tsagana",170, 270, 370);

        ArrayList<Student> al = new ArrayList();
        al.add(s3);
        al.add(s2);
        al.add(s1);

        for(Student s:al){
            System.out.println(s.getAverage());
        }
        System.out.println(al);
    }
}
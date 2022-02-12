package com.busyqa.oops;

public class Rough {

    int a = 10;

    static int updateBYValue(int y) {
        y = y + 1;
        return y;
    }

    static int updatebyRef(Rough r) {
        r.a = r.a + 1;
        return r.a;
    }

    public static void main(String[] args) {
        int y = 100;
        Rough r = new Rough();
        System.out.println(updatebyRef(r));//addr
        System.out.println(r.a);//11
    }
}

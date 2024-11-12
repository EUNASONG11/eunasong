package com.green.javaextra.day02;

public class Test2 {
    public static void main(String[] args) {
        int v1 = 10, v2 = 5;

        MyMath.multi(v1, v2);

        MyMath myMath = new MyMath();
        myMath.divide(v1, v2);
    }
}

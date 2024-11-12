package com.green.javaextra.day02;

public class MyRandom {

    public static void random() {
        int result = (int)(Math.random() * 5.0) + 1;
        System.out.println(result);
    }

    public int abs(int n) {
        return n < 0 ? -n : n;
    }
}

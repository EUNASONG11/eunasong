package com.green.javaextra.day02;

public class MyRandom {

    public static void random() {
        int result = (int)(Math.random() * 5.0) + 1;
        System.out.println(result);
    }

    public int abs(int n) {
        return n < 0 ? -n : n;
    }

    public static void printGugudan(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
        System.out.println();
    }
}

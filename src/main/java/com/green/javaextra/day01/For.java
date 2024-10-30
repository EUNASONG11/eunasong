package com.green.javaextra.day01;

public class For {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8) + 2;

        for (int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n", dan, i, (i * dan));
        }
        System.out.println("-----");

        for (int i = 1; i <= 9; i++) {
            for (int z = 1; z <= 9; z++) {
                System.out.printf("%d x %d = %d\n", i, z, (i * z));
            }
            System.out.println();
        }
    }
}
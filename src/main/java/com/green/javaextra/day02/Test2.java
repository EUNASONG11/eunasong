package com.green.javaextra.day02;

public class Test2 {
    public static void main(String[] args) {
        int v1 = 10, v2 = 5;

        MyMath.multi(v1, v2);

        System.out.println("---------");

        MyMath myMath = new MyMath();
        myMath.divide(v1, v2);

        System.out.println("----------");

        System.out.println(myMath.sum(v1, v2));

        System.out.println("----------");

        if (myMath.test(v1, v2)) {
            System.out.println("둘의 값이 같다");
        }
        System.out.println("둘의 값이 다르다");
    }
}

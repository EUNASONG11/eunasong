package com.green.javaextra.day02;

public class Test3 {
    public static void main(String[] args) {
        MyRandom.random(); // 1 ~ 5사이의 랜덤값이 출력되게 해주세요.
        // MyRandom.abs(-10);

        MyRandom mr = new MyRandom();
        mr.abs(30);
    }
}

package com.green.javaextra.day01;

public class Variable2 {
    public static void main(String[] args) {
        int n = 10;

        n = n + 20; // 변수 n을 읽고 > 쓰기
        //n = 10 + 20;
        //n = 30;
        System.out.println(n);

        n += 30; //복합식
        // n = n + 30;과 같다
        // n = 30 + 30;
        // n = 60;
        System.out.println(n);

        n++; //증가식 >> 쓰기만(변수의 값 변경만)
        ++n; //증가식 >> 쓰기만
        //쓰기만 할 때는 ++가 변수 앞/뒤 아무 곳이나 상관없다.
        System.out.println(n);

        System.out.println(n--); // 읽기 > 쓰기
        System.out.println(--n); // 쓰기 > 읽기
        System.out.println(n); //읽기만

    }
}

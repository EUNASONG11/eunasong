package com.green.javaextra.day01;

public class Variable {
    public static void main(String[] args) {
        /*
        변수 선언 >> 데이터를 저장하기 위한 공간 할당
        정확히는 정수형(int형) 변수 선언, 변수명은 n
        변수를 선언하는 이유는 데이터를 저장하기 위해
        정해져 있는 데이터만 저장하고 싶다. >> 데이터 타입(int)

        Typed Language, 데이터 타입이 굉장히 중요 >> 신뢰!

        저장된 데이터가 변할 수 있어서 변수라고 부른다.

        리터럴은 값 그 자체, 리터럴은 저장 능력이 없다.

        선언은 한번만 한다. 선언된 이후는 쓰기/읽기만 하면 된다.
         */
        int n; // 일반(primitive type) 변수, 리터럴을 저장할 수 있다.
        n = 10; //대입연산자는 우측의 데이터를 복사하여 왼쪽 공간에 저장
        //최초로 값 넣는 행위를 초기화라고 한다.
        System.out.println("n : " + n); //읽기

        n = 12; //쓰기(변경)
        System.out.println("n : " + n);

        String s = "dd"; //변수 선언과 동시에 초기화
        String s2= new String("dd");
        //레퍼런스 변수는 객체의 주소값을 저장할 수 있다. 대문자로 시작, 더 정확히는 String 타입의 객체 주소값을 저장할 수 있다.
        /*
        대문자로 시작하는 타입은 주소값을 저장할 수 있다.
        >> 객체의 주소값을 저장할 수 있다.
        >> 선언된 class를 객체화 한 객체의 주소값을 저장할 수 있다.
         */
    }
}

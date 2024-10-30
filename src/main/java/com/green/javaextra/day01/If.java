package com.green.javaextra.day01;

public class If {
    public static void main(String[] args) {
        int rVal = (int)(Math.random() * 20.0) + 1; //1 ~ 20 랜덤 숫자 나올 수 있도록 세팅

        //Math: class
        //random(): static, 리턴 메소드(앞에 int rVal = 의 형태가 있어서, 리턴 타입이 아니면 Math.random()으로 적을 수 있다.)

        //rVal값이 홀수면 홀수, 짝수면 짝수로 나오게 출력
        if (rVal % 2 == 0) {
            System.out.printf("%d는(은) 짝수입니다.\n", rVal);
        } else {
            System.out.printf("%d는(은) 홀수입니다.\n", rVal);
        }

        System.out.println("-------");

        System.out.println(rVal % 2 == 0 ? rVal + "는(은) 짝수입니다" : rVal + "는(은) 홀수입니다");

        System.out.println("-------");

        String result = rVal % 2 == 0 ? "짝" : "홀";
        System.out.printf("%d는(은) %s수입니다.\n", rVal, result);
    }
}

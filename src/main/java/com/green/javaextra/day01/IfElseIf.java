package com.green.javaextra.day01;

public class IfElseIf {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0 ~ 100 사이의 랜덤값이 나올 수 있도록 세팅

        if (score >= 90 && score <= 100) {
            System.out.println(score + "점 A");
        } else if (score >= 80 && score <= 89) {
            System.out.println(score + "점 B");
        } else {
            System.out.println(score + "점 C");
        }

        System.out.println("-------");

        String grade2 = "C";
        if (score >= 90) {
            grade2 = "A";
        } else if (score >= 80) {
            grade2 = "B";
        } else {

        }
        System.out.printf("%d점 %s\n", score, grade2);

        System.out.println("-------");

        String grade = "C";
        int gradescore = score /10;
        switch(gradescore) {
            case 9, 10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
        }
        System.out.println(score + "점 "+ grade);
    }
}

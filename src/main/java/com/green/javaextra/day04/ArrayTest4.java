package com.green.javaextra.day04;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 11, 18, 22 };

        //레퍼런스 변수 arr + 메소드 조합
        //1. arrCopy는 메소드 >> ()가 있기 때문에
        //2. 인스턴스 메소드인가? 클래스 메소드인가? >> 클래스 메소드는 객체화가 필요함. 인스턴스 메소드는 객체화 없이 클래스 이름을 통해 직접 호출 가능
        //3. 리턴 메소드인가? void 메소드인가? >> 값 호출, 'int[] arr2 =', 리턴 타입은 int[]
        //4. 메소드 명은 arrCopy
        //5. 파라미터는 2개, 첫 번째 파라미터 타입은 int[] (arr), 두 번째 파라미터 타입은 int (1)
        int[] arr2 = arrCopy(arr, 1);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] arrCopy(int[] arr, int add) {
        int[] tmp = new int[arr.length]; // 똑같은 크기의 새로운 배열을 만든다.
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i] + add;
        }
        return tmp;
    }
}

package com.green.javaextra.day04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    /*
    배열의 단점을 보완한 것이 ArrayList라고 생각하면 된다.
    - 배열의 길이가 고정이다.
    - 몇번 방(index)를 꼭 지정해 주어야 한다. >> 실수할 가능성이 생긴다.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //<Integer> 타입 지정은 필수, 타입 지정을 안하면 Object가 되기 때문에 매번 형 변환이 필요하다.
        List<Integer> list2 = new ArrayList<>(10); // 10으로 초기 용량 설정, 새로운 배열을 만들지 않고 기본 10번 방까지 있는 배열이 만들어지고 시작. 성능상 좋음.
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        System.out.println(list2.get(3)); // 넣을 때는 add, 뺼 때는 get
        System.out.printf("size : %d", list2.size());

        /*
        List<Integer>일 때만 remove(int index)로만 삭제 가능하다.
        List<Integer>외의 경우에는 index와 data로도 삭제 가능하다.
         */
        System.out.println(list2.remove(10));
    }
}

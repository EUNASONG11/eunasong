package com.green.javaextra.day04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        String str3 = "C";
        String str4 = "D";
        String str5 = "E";

        List<String> list = new ArrayList<>(5);
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);

        System.out.println(list);
        System.out.println(list.get(1));

        //index로 삭제
        System.out.println(list.remove(1));
        System.out.println(list);

        //data로 삭제
        System.out.println(list.remove(str3));
        System.out.println(list);
        System.out.println(list.remove(str5));

        list.add("A");
        System.out.println(list);

        System.out.println(list.remove("A"));
        System.out.println(list);

    }
}

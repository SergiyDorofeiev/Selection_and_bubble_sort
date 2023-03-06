package com.app01;

import java.util.ArrayList;
import java.util.Arrays;

public class App02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(23);
        arrayList.add("aaa");
        arrayList.add(new Person());
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++){
            Object element = arrayList.get(i);
            System.out.println("i = " + i + "; element = " + element);
        }
        System.out.println("-----------Generic String---------");
        ArrayList<String> list = new ArrayList<>();
        list.add("text");
        list.add("text2");
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println("i = " + i + "; element = " + element);
        }

        System.out.println("-----------Generic Integer---------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(4);
        list2.add(-7);
        list2.add(-4);
        for (int i =  0; i < list2.size(); i++){
            int element = list2.get(i);
            System.out.println("i = " + i + "; element = " + element);
        }

    }

}

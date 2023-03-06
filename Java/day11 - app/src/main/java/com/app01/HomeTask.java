package com.app01;

import java.util.ArrayList;

public class HomeTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(-7);
        list.add(7);
        list.add(2);
        list.add(7);
        list.add(89);
        list.add(-6);
        list.add(7);
        list.add(20);
        System.out.println("list = " + list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(-90);
        list2.add(67);
        list2.add(4);
        list2.add(0);
        list2.add(34);
        list2.add(7);


        System.out.println("max element = " + max(list));
        System.out.println("min element = " + min(list));
        System.out.println("sum elements = " + sum(list));
        System.out.println("product elements = " + product(list));
        System.out.println("average = " + sum(list)/ list.size());
        System.out.println("count 7 = " + count(list));

        int index= linearSearch(list, 2);
        if (index == -1){
            System.out.println("Target linearSearch not found");
        }
        else {
            System.out.println("Target's index linearSearch found in index = " + index);
        }

        int index2 = binarySearch(list, -99);
        if (index2 == -1){
            System.out.println("Target binarySearch not found");
        }
        else {
            System.out.println("Target's index binarySearch found in index = " + index2);
        }

        revert(list);
        System.out.println("revert list = " + list);

        System.out.println("list = " + list);
        BubbleSort(list);
        System.out.println("BubbleSort's List = " + list);

        System.out.println("list2 = " + list2);
        selectionSort(list2);
        System.out.println("SelectionSort's List = " + list2);


    }

    public static int max(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }

    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    public static int product(ArrayList<Integer> list){
        int prod = 1;
        for (int i = 0; i < list.size(); i++){
            prod *= list.get(i);
        }
        return prod;
    }

    public static int count(ArrayList<Integer> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 7){
                count++;
            }
        }
        return count;
    }

    public static int linearSearch(ArrayList<Integer> list, int target){
        int index = -1;
        for (int i = 0; i < list.size(); i++){
            if (target == list.get(i)){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int binarySearch(ArrayList<Integer> list, int target){
        int start = 0;
        int end = list.size() - 1;
        int index = -1;
        while (start <= end){
            int middle = (start + end) / 2;
            if (list.get(middle) == target){
                index = middle;
                break;
            }
            if (target < list.get(middle)){
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return index;
    }

    public static void BubbleSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            int currentValue = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i) > list.get(j)){
                    swap(list, i, j);
                }
            }
        }
    }

    public static void selectionSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            int min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j) < min){
                    min = list.get(j);
                    minIndex = j;
                }
            if (min != list.get(i)){
                swap(list, i, minIndex);
            }
            }
        }
    }

    public static void revert(ArrayList<Integer> list){
        for (int i = 0; i < list.size()/2; i++){
            swap(list, i, list.size() - 1 - i);
        }
    }

    public static void swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        int a = list.get(j);
        list.set(i, a);
        list.set(j, temp);
    }
}

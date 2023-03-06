package com.app01;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {10, -4, 45, -8, 9, 3};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data){
        for (int i = 0; i < data.length; i++){
            int min = data[i];
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[j] < min){
                    min = data[j];
                    minIndex = j;
                }
            if (min != data[i]){
                swap(data, i, minIndex);
            }
            }
        }
    }

    private static void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}

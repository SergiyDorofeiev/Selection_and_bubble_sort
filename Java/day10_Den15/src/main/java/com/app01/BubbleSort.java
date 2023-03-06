package com.app01;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10, -4, 45, -8, 9, 3, 78, -78, 5};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data){
        for (int i = 0; i < data.length; i++){
            int currentValue = data[i];
            int index = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[i] > data[j]){
                    swap(data, i, j);
                }
            }
        }
    }

    private static void swap(int[] data, int i, int j){
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
}

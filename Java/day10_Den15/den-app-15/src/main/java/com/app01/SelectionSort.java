package com.app01;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {10,4,-1,2,7};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data){
        for(int i=0;i<data.length;i++){
            int currentValue = data[i];
            int min = currentValue;
            int minIndex = i;
            for(int j=i+i;j<data.length;j++){
                if(data[j]<min){
                    min=data[j];
                    minIndex = j;
                }
            }
            if(currentValue!=min){
                swap(data, minIndex, i);
            }
        }
    }

    private static void swap(int[] data, int i, int j){
        int tmp = data[i];
        data[i]=data[j];
        data[j]=tmp;
    }


}

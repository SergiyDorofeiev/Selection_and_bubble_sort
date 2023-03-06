package com.app01;

import java.util.Arrays;


//O(n^2)
public class SelectionSort2 {

    public static void main(String[] args) {
        int[] data = {10,4,-1,2,7};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data){
         for(int i=0;i<data.length;i++){
             //int currrentValue = data[i];
             int max = data[i];
             int maxIndex = i;
             for(int j=i+1;j<data.length;j++){
                if(data[j]>max){
                    max = data[j];
                    maxIndex = j;
                }
             }

             if(data[i]!=max){
                swap(data, maxIndex, i);
             }
         }
    }

    private static void swap(int[] data, int i, int j){
        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];
    }


}

package com.newCood;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] a = {2,3,1,5,6,8,7};
        System.out.println(Arrays.toString(new selectSort().Sort(a)));
    }
    private int[] Sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;
    }
}

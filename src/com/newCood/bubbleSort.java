package com.newCood;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {2,3,1,5,6,8,7};
        System.out.println(Arrays.toString(new bubbleSort().Sort(a)));
    }
    private int[] Sort(int[] a){
        int length = a.length;
        for (int i = 1; i < length; i++) {
            if (a[length-i]<a[length-(i+1)]){
                int temp = a[length-i];
                a[length-i] = a[length-(i+1)];
                a[length-(i+1)] = temp;
            }
        }
        return a;
    }
}

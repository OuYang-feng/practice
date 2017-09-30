package com.newCood;

import java.util.Arrays;

public class findMinMoves {
    public static void main(String[] args) {
        int[] num = {4,0,0,4};
        System.out.println(new findMinMoves().moveNum(num));
    }

    private int moveNum(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        if (sum%num.length!=0){
            return -1;
        }
        int average = 0;
        average = sum/num.length;

        sum = 0;
        int[] count = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            count[i] = num[i] - average;
        }
        for (int i = 0; i < num.length; i++) {
            if (count[i]>0){
                sum += count[i];
            }
        }
        return sum;
    }
}

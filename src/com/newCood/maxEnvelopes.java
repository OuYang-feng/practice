package com.newCood;

import java.util.ArrayList;
import java.util.List;

public class maxEnvelopes {

    public static void main(String[] args) {
        int[][] envelopes = {{5,6,6,2},{4,4,7,3}};
         System.out.println(new maxEnvelopes().maxNum(envelopes));
    }

    private int maxNum(int[][] envelopes) {
        int count = 0;
        sort(envelopes);
        int num = envelopes[1][0];
        for (int i = 1; i < envelopes[0].length; i++) {
            if (envelopes[1][i] >= num){
                count++;
                num = envelopes[1][i];
            }
        }
        return count;
    }

    private int[][] sort(int[][] envelopes){
        int length = envelopes[0].length;
        for (int i = 1; i < length; i++) {
            if (envelopes[0][length-i]<envelopes[0][length-(i+1)]){
                int temp = envelopes[0][length-i];
                envelopes[0][length-i] = envelopes[0][length-(i+1)];
                envelopes[0][length-(i+1)] = temp;
                temp = envelopes[1][length-i];
                envelopes[1][length-i] = envelopes[1][length-(i+1)];
                envelopes[1][length-(i+1)] = temp;
            }
        }
        return envelopes;
    }
}

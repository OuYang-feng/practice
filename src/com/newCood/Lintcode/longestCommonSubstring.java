package com.newCood.Lintcode;

import java.util.ArrayList;
import java.util.List;

public class longestCommonSubstring {
    public static void main(String[] args) {

    }
    private int longestCommonSubstring(String A,String B){
        int size1 = A.length();
        int size2 = B.length();

        int[][] table = new int[size1+1][size2+1];

        for (int i = 1; i < size1+1; i++) {
            for (int j = 1; j < size2+1; j++) {
                if (A.charAt(i)==B.charAt(j)){
                    table[i][j] = table[i-1][j-1] + 1;
                }else {
//                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                    table[i][j] = 0;
                }
            }
        }

        List<Character> list = new ArrayList<>();
        int i = size1;
        int j = size2;

        while ((i!=0)&&(j!=0)){
            if (A.charAt(i-1)==B.charAt(j-1)){
                list.add(A.charAt(i-1));
                i--;
                j--;
            }else {
                if (table[i-1][j]<table[i][j-1]){
                    i--;
                }else {
                    j--;
                }
            }
        }
        return list.size();
    }
}

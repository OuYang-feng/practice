package com.newCood;

import java.util.ArrayList;
import java.util.List;
/*
     求最长公共子序列（不要求连续）：
        当str1[i] ！= str2[j]时，veca[i][j] = max{veca[i - 1][j], veca[i][j - 1]}；
        当str1[i] == str2[j]时，子序列长度veca[i][j] = veca[i - 1][j - 1] + 1；
     求最长公共子串（连续）求字串的方法和求子序列方法类似：
        当str1[i] == str2[j]时，子序列长度veca[i][j] = veca[i - 1][j - 1] + 1；
        只是当str1[i] ！= str2[j]时，veca[i][j]长度要为0，而不是max{veca[i - 1][j], veca[i][j - 1]}。
 */
public class LCS_caculate {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a";
        LCS(s1,s2);
    }
    private static void LCS(String s1,String s2){
        int size1 = s1.length();
        int size2 = s2.length();

        int[][] table = new int[size1+1][size2+1];

        for (int i = 1; i <= size1; i++) {
            for (int j = 1; j <= size2; j++) {
                if (s1.charAt(i-1)==s2.charAt(i-1)){
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
            if (s1.charAt(i-1)==s2.charAt(j-1)){
                list.add(s1.charAt(i-1));
                i--;
                j--;
            }else {
                if (table[i-1][j]<table[i][j-1]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        System.out.println(list.size());
        for (int k = list.size()-1; k >0 ; k--) {
            System.out.print(list.get(k));
        }
    }

}

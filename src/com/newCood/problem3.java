package com.newCood;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array1 = new int[n][n];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                array1[i][j]=sc.nextInt();
            }
        }
        int[][] array2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int m = 0; m < n; m++) {
                    array2[array1[0][i]][j] = array1[0][m]-array1[0][i]+array1[1][m]-array1[1][i];
                }
            }
        }

        int[] minSum=new int[n];

        for (int i = 0; i < 4; i++) {

        }
    }
}

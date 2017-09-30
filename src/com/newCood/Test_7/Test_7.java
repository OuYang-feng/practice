package com.newCood.Test_7;

import java.util.Scanner;

/*
    动态规范思想

    考虑负负得正的情况，需要到当前值为止的最大值和最小值

    maxSum[k][i] = MAX{maxSum[k-1][i-1]*nowArr[i],minSum[k-1][i-1]*nowArr[i]};  表示选取K个学生，以第i个学生结尾的乘积最大值

    minSum[k][i] = MIN{minSum[k-1][i-1]*nowArr[i],maxSum[k-1][i-1]*nowArr[i]};  表示选取K个学生，以第i个学生结尾的乘积最小值
 */
public class Test_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nowArr = new int[n];
        for (int i = 0; i < n; i++) {
            nowArr[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        int D = scanner.nextInt();

        long[][] maxSum = new long[K][n];
        long[][] minSum = new long[K][n];
//
//        for (int i = 0; i < K; i++) {
//            for (int j = 0; j < n; j++) {
//                maxSum[i][j] = minSum [i][j] = 1;
//                if (i == 0){
//                    maxSum[0][j] = nowArr[j];
//                    minSum[0][j] = nowArr[j];
//                }
//            }
//        }
//
        long res = Integer.MIN_VALUE; // 记得用Long类型，考虑数值范围
            for (int i = 1; i <=n; i++) {
                maxSum[1][i] = nowArr[i];
                minSum[1][i] = nowArr[i];
                for (int k = 2; k <=K; k++) {
                    for (int j = i-1 ; j > 0 && i-j<=D ; j--) {
                        maxSum[k][i] = Math.max(maxSum[k][i], Math.max(maxSum[k-1][j] * nowArr[i], maxSum[k-1][j] * nowArr[i]));
                        minSum[k][i] = Math.min(minSum[k][i], Math.min(minSum[k-1][j] * nowArr[i], minSum[k-1][j] * nowArr[i]));
                        }
                }
                res = Math.max(res ,maxSum[K][i]);
            }
        System.out.println(res);
    }

}

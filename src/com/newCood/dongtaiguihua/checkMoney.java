//package com.newCood.动态规划;
//
//
///*
//    动态规范  找零钱问题
//    分为两种情况
//    零钱大于当前面值时：
//        dp[n][m]为使用前n中面值凑成的m的种数
//        dp[n][m] = dp[n-1][m] + dp[n][m-peney[n]];
//    零钱小于当前面值时：
// */
//public class checkMoney {
//    public int countWays(int[] penny,int n,int aim){
//        if (n==0||penny==null||aim<0){
//            return 0;
//        }
//        int[][] pd = new int[n][aim+1];
//        for (int i = 0; i < n; i++) {
//            pd[i][0] = 1;
//        }
//        for (int i = 1; penny[0]*i <= aim ; i++) {
//            pd[0][penny[0]*i] = 1;
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j <= aim; j++) {
//                if (j>=penny[i]){
//                    pd[i][j] = pd[i-1][j]+pd[i][j-penny[i]];
//                }else {
//                    pd[i][j] = pd[i-1][j];
//                }
//            }
//        }
//        return pd[n-1][aim];
//    }
//}

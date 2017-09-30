//package com.newCood.动态规划;
//
//import java.util.Scanner;
//
///*
//    数字三角形
//    从上到下找一条路径求路径和的最大值
//    dongtaiguihua  把问题最小化
//    初始条件 if r==N   MaxSum（r,j）= D(r,j) 边界
//    转移方程 MaxSum(r,j) = Max{MaxSum(r+1,j),MaxSum(r+1,j+1)}+D(r,j)
// */
//
//public class maxSum {
//    //方案1 空间消耗过大 运行超时
////    private static int n;
////    private static int[][] D = new int[101][101];
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        n = scanner.nextInt();
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < i; j++) {
////                D[i][j] = scanner.nextInt();
////            }
////        }
////        System.out.println(MaxSum(1,1));
////    }
////
////    private static int MaxSum(int i,int j){
////        if (i==n){
////            return D[i][j];
////        }else {
////            int x = MaxSum(i+1,j);
////            int y = MaxSum(i+1,j+1);
////            return Math.max(x,y) + D[i][j];
////        }
////
////    }
//    //方案2 对重复的子问题进行存储，需要用的时候直接取出
////    private static int n;
////    private static int[][] D = new int[101][101];
////    private static int[][] maxSum = new int[101][101];
////
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        n = scanner.nextInt();
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < i; j++) {
////                D[i][j] = scanner.nextInt();
////                maxSum[i][j] = -1;
////            }
////        }
////        System.out.println(MaxSum(1,1));
////    }
////
////    private static int MaxSum(int i,int j){
////        if (maxSum[i][j]!=-1){
////            return maxSum[i][j];
////        }
////        if (i==n){
////            maxSum[i][j] = D[i][j];
////        }else {
////            int x = MaxSum(i+1,j);
////            int y = MaxSum(i+1,j+1);
////            maxSum[i][j] = Math.max(x,y) + D[i][j];
////        }
////        return maxSum[i][j];
////    }
//
//    //方案3：自底向上递推
//    private static int n;
//    private static int[][] D = new int[101][101];
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                D[i][j] = scanner.nextInt();
//            }
//        }
//        int[] maxSum = new int[n];
//        for (int i = n-1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (i==n-1){
//                    maxSum[j] = D[n-1][j];
//                }
//                maxSum[j] = Math.max(maxSum[j],maxSum[j+1])+D[i][j];
//            }
//        }
//
//    }
//
//}
//
//

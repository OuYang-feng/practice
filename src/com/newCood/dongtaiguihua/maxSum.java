//package com.newCood.��̬�滮;
//
//import java.util.Scanner;
//
///*
//    ����������
//    ���ϵ�����һ��·����·���͵����ֵ
//    dongtaiguihua  ��������С��
//    ��ʼ���� if r==N   MaxSum��r,j��= D(r,j) �߽�
//    ת�Ʒ��� MaxSum(r,j) = Max{MaxSum(r+1,j),MaxSum(r+1,j+1)}+D(r,j)
// */
//
//public class maxSum {
//    //����1 �ռ����Ĺ��� ���г�ʱ
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
//    //����2 ���ظ�����������д洢����Ҫ�õ�ʱ��ֱ��ȡ��
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
//    //����3���Ե����ϵ���
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

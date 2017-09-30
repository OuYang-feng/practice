package com.newCood;

import java.util.Random;
import java.util.Scanner;

public class Problem {
    static int Count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int k = in.nextInt();
            int[] array = new int[n];
            Random random = new Random();
            for (int m = 1; m < n*k; m++) {

                for (int j = 0; j <= n; j++) {
                    array[j] = random.nextInt() * 6 + 1;
                }

                for (int i = 0; i <= n; i++) {
                    if ((array[i] <= array[i + 1]) || ((array[i]%array[i+1])) != 0) {
                        Count++;
                    }
                }
            }
            System.out.println(Count%1000000007);
        }
        //1~k中n个数
    }
}

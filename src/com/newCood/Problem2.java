package com.newCood;

import java.util.Scanner;

/*
    d>=x*n+0   n<=f
    d>=x*n+(n-f)p  n>f   ��n���������
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//ע��while������case
            int x = in.nextInt();
            int f = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int n = (int) Math.floor((d + f * p) / (x + p));
            if ((x>=1)&&(f>=1)&&(d>=1)&&(p>=1)){
                if (n <= (d / x)) {
                    System.out.println(n);
                }else {
                    System.out.println((int)Math.floor(d/x));
                }
            }

        }
    }
}

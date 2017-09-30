package com.newCood.Test_5;


/*
    x^2+y^2=25
    x=[-5,5]
    y=[-5,5]
    求优雅的，即在圆上的点，同时横纵坐标都为整数
 */

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = Integer.parseInt(scanner.next());
        int num = 25;
        int count = 0;
        int Round = (int)(Math.abs(Math.sqrt(num)));
//        for (int x = -Round; x <=Round ; x++) {
//            for (int y = -Round; y <= Round; y++) {
//                if ((Math.pow(x,2)+Math.pow(y,2)==num)){
//                    count++;
//                }
//            }
//        }
        System.out.println(count);
    }
}

package com.newCood;

import java.util.Arrays;
import java.util.Scanner;

public class strAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] snew = str1.split("\\s+");
        int[] ints = new int[snew.length];
        int res = 0;
        try{
            for (int i = 0; i < snew.length; i++) {
                ints[i] = Integer.parseInt(snew[i]);
                res+=ints[i];
            }
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error");
        }

    }
}

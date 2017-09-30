package com.newCood;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class meituan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String[] sNum = str.split("\\s+");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < sNum.length; i++) {
            for (int j = 0; j < sNum.length; j++) {
                if (i!=j){
                    String s1 = sNum[i]+sNum[j];
                    String s2 = sNum[j]+sNum[i];
                    if (!list.contains(s1)||!list.contains(s2)){
                        list.add(s1);
                        list.add(s2);
                    }
                }

            }
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            long l = Long.parseLong(list.get(i));
            if (l%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

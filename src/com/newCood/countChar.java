package com.newCood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
    统计第一个出现三次的字符
 */
public class countChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(scanner.nextLine());


            int[] arr = new int[127];

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);  //存储的是字符对应的ascII码
                arr[c]++;
//                if (arr[c] == 3 && (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')){
//                    System.out.println(c);
//                    break;
//                }
            }
            List<Integer> list = new ArrayList<>();
            int index = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]==0){
                    continue;
                }else {
                    list.add(i);
                }

        }
//        for (int i = index,j = 0; i < arr.length-1; i++,j++) {
//
//            newArr[j] = arr[i];
//        }


    }
}

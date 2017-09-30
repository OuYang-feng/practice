package com.newCood;

import java.util.Scanner;

public class meituan2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String[] sNum = str.split("\\s+");
        int[] nums = new int[sNum.length];
        int right = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sNum[i]);
            if (nums[i]==0){
                right++;
            }
        }
            change(nums);
    }
    private static void change(int[] nums){
        int index = 0,right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                index = i;
            }
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i]==1){
                nums[i]=0;
            }else {
                nums[i]=1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                right++;
            }
        }
        if (right==0){
            if (count%2==0){
                System.out.println("Alice");
            }else {
                System.out.println("Bob");
            }
        }else {
            count++;
            change(nums);
        }


//                for (int j = i; j < nums.length; j++) {
//                    if (nums[j]==1){
//                        nums[j]=0;
//                    }else {
//                        nums[j]=1;
//                    }
//                }
//                break;
//            }else {
//                if (count%2==0){
//                    System.out.println("Alice");
//                }else {
//                    System.out.println("Bob");
//                }
//            }
//        }
//        count++;
//
//        change(nums,0);

    }
}

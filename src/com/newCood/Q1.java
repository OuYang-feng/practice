package com.newCood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    private static List<Integer> list;
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] num = str1.split("\\s+");
        int n = Integer.parseInt(num[0]);
        int aim = Integer.parseInt(num[1]);
        String str = scanner.nextLine();
        list = new ArrayList<>();
        String[] split = str.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.parseInt(split[i]));
        }
        int optionalBegin = 0;
        if (n<=20&&n>=1){
            callOptional(new ArrayList<>(),aim,optionalBegin);
        }else {
            System.out.println("NO");
        }
        if (count==0){
            System.out.println("NO");
        }
    }
    private static void   callOptional(List<Integer> mustList, int aim, int optionalBegin){
        if (aim == 0){
            count++;
            System.out.println("YES");
            int[] nums = new int[mustList.size()];
            for (int i = 0; i < mustList.size(); i++) {
                nums[i] = list.get(mustList.get(i));
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
        while (optionalBegin < list.size()){
            int newAim = aim - list.get(optionalBegin);
            List<Integer> newMustList = new ArrayList<>(mustList);
            newMustList.add(optionalBegin);
            callOptional(newMustList,newAim,++optionalBegin);
        }
    }
}

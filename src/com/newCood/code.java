package com.newCood;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("\\,");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        sort(nums,0,nums.length-1);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int[] a, int l, int r){

        if (l < r)
        {
            int i = l, j = r, x = a[l];
            while (i < j)
            {
                while(i < j && a[j] >= x)
                    j--;
                if(i < j)
                    a[i++] = a[j];

                while(i < j && a[i] < x)
                    i++;
                if(i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            sort(a, l, i - 1);
            sort(a, i + 1, r);
        }

        return a;
    }
}

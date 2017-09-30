package com.newCood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    从一个数组中找出四个元素和为零的子数组 4Sum 问题 先枚举2个再用高低索引遍历
 */
public class fourSumToZero {
    public static void main(String[] args) {
        int[] num = {-2,-1,0,1,0,2};
        System.out.println(new fourSumToZero().fourSum(num,0));
    }
    private List<List<Integer>> fourSum(int[] num,int target){

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (num.length<4) return res;
        Arrays.sort(num);

        for (int i = 0; i < num.length-3; i++) {
            if (num[i]+num[i+1]+num[i+2]+num[i+3]>target) break;
            if (num[i]+num[num.length-1]+num[num.length-2]+num[num.length-3]<target) continue;
            if (i>0&&num[i]==num[i-1]) continue;
            for (int j = i + 1; j < num.length-2; j++) {
                if (num[i]+num[j]+num[j+1]+num[j+2]>target) break;
                if (num[i]+num[j]+num[num.length-1]+num[num.length-2]<target) continue;
                if (j>i+1&&num[j]==num[j-1]) continue;
                int low = j + 1, high = num.length - 1;
                while (low<high){
                    int sum = num[i]+num[j]+num[low]+num[high];
                    if (sum==target){
                        res.add(Arrays.asList(num[i],num[j],num[low],num[high]));
                        while (low<high&&num[low]==num[low+1]) low++;
                        while (low<high&&num[high]==num[high-1]) high--;
                        low++;
                        high--;
                    }else if (sum<target) low++;
                    else  high--;
                }
            }
        }
        return res;
    }
}

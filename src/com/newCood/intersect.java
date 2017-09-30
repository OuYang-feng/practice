package com.newCood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    寻找两个数组中重复出现的部分
 */
public class intersect {
    public static void main(String[] args) {
        int[] nums1={1,1,2};
        int[] nums2={1,1};
        System.out.println(Arrays.toString(new intersect().intersect(nums1,nums2)));
    }
    private int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (list1.contains(nums2[j])){
                list2.add(nums2[j]);
                list1.remove((Integer)nums2[j]);
            }
        }
        int[] a = new int[list2.size()];
        for(int i=0;i<list2.size();i++)
        {
            a[i] = list2.get(i);
        }
        return a;
    }

}

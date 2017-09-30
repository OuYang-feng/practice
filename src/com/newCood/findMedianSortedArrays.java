package com.newCood;

import com.newCood.Test_3.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {2,3,4};
        System.out.println(new findMedianSortedArrays().findMedianSortedArrays(nums1,nums2));
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        double rs = 0;
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            list.add(nums2[j]);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if((int)o1<(int)o2)
                    return 1;
                else
                    return -1;
            }
        });
        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(list.get(i));
//        }
        if (size % 2 == 0){
             rs = (double) (list.get((size/2)-1)+list.get((size/2)))/2;
        }else {
             rs = (double) list.get((int) Math.ceil((size/2)));
        }
        return rs;
    }
}

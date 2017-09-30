package com.newCood;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {

        /*Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Integer[] a = {1,1,1,3,2,2,2};
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i],(map.get(a[i])+1));
            }else {
                map.put(a[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
                return;
            }
        }*/

    }
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],(map.get(nums[i])+1));
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}

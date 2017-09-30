package com.newCood;

import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args) {
        boolean b=true?false:true==true?false:true;
//        System.out.println(b);
    }
    public int sum(ArrayList<Integer> arrayList,int k){
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        if (sum%k==0){
            return max = arrayList.size();
        }
        sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = arrayList.get(i);
            arrayList.remove(i);
            for (int num : arrayList){
                 sum +=arrayList.get(i);
            }
            if (sum % k == 0){
                list.add(sum);
            }
            sum(arrayList,k);
            arrayList.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<=list.get(i+1)){
                max = list.get(i+1);
            }
        }
        return max;
    }
}

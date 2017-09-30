package com.newCood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMatchSequence {
    private static List<Integer> list;
    private static int base = 5;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,1,3,4,5));

        int aim = 5;
        int optionalBegin = 0;

        callOptional(new ArrayList<>(),aim,optionalBegin);
    }
    private static void callOptional(List<Integer> mustList,int aim, int optionalBegin){
        if (aim == 0){
            System.out.println(mustList);
        }
        while (optionalBegin < list.size()){
            int newAim = (aim + list.get(optionalBegin)) % base;
            List<Integer> newMustList = new ArrayList<>(mustList);
            newMustList.add(optionalBegin);
            callOptional(newMustList,newAim,++optionalBegin);
        }
    }
}

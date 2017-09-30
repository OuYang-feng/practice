package com.newCood;

import java.util.*;

public class reConstructQueue {
    public static void main(String[] args) {
        int[][] people = {{0,0,2,1,4,1},{5,7,5,6,4,7}};
//        for (int i = 0; i < people.length; i++) {
//            for (int j = 0; j < people[i].length ; j++) {
//                System.out.println(people[i][j]);
//            }
//        }
        System.out.println(Arrays.toString(new reConstructQueue().reconstructQueue(people)));
    }
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];

        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) return a[1] - b[1];  //比较身高 ，如果相同，则比较 比他高的人的个数。   1是升序，-1是降序
                return b[0] - a[0];
            }
        });

        int n = people.length;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});

        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : tmp) {
            res[i][0] = k[0];
            res[i++][1] = k[1];
        }

        return res;
    }
}

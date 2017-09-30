package com.newCood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] num = str.split("\\s+");
        int p = Integer.parseInt(num[0]);
        int r = Integer.parseInt(num[1]);
        String[][] map = new String[2][r];
        String s = scanner.nextLine();
        String[] split = s.split("\\s+");
        for (int i = 0,j=0; i < split.length; i=i+2,j++) {
            map[0][j] = split[i];
        }
        for (int i = 1,j=0; i < split.length; i=i+2,j++) {
            map[1][j] = split[i];
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!list.contains(split[i])){
                list.add(split[i]);
            }
        }
        //ÊÇ·ñÁªÍ¨
        isConect(map, list,0,r);

    }

    private static void isConect(String[][] map, List<String> list,int k,int r) {
        List<String> newList = new ArrayList<>();
        newList.add(map[0][0]);
        newList.add(map[1][0]);

        for (int i = 0; i < map[0].length; i++) {
            for (int j = 0; j < map[1].length; j++) {
                if (map[0][i].equals(map[1][k])||map[1][j].equals(map[1][k])){
                    if (!list.contains(map[0][i])){
                        list.add(map[0][i]);
                        isConect(map, list,i,r);
                    }
                    if (!list.contains(map[0][j])){
                        list.add(map[0][j]);
                        isConect(map, list,j,r);
                    }
                }
            }
        }
        if (newList.size()!=r){
            System.out.println("DISCONNECTED");
        }
    }
}

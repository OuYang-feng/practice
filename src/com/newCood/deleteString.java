package com.newCood;

import java.util.*;
/*
    删除出现次数最少的字符
 */
public class deleteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Delete(s);

    }
    private static void Delete(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else {
                int i1 = map.get(chars[i]) + 1;
                map.replace(chars[i],map.get(chars[i]),i1);
            }
        }
        int index = 0;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(chars[i])>map.get(chars[i+1])){
                index = i+1;
            }
        }
        list.add(index);
        for (int i = 0; i < map.size(); i++) {
            if (map.get(chars[i]).equals(map.get(chars[index]))){
                if (index!=i){
                    list.add(i);
                }
            }
        }
        for (int i : list){
            map.remove(chars[i]);
        }
        Set<Character> set = map.keySet();
        for (char c : set){
            for (int i = 0; i < map.get(c); i++) {
                System.out.print(c);
            }
        }
    }
}

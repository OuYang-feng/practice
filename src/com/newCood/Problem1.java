package com.newCood;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();
            boolean result = isContain(str1,str2);
            if (result){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean isContain(String str1,String str2){
        for (int i = 0,index=0;i<str1.length();i++){
            if (str1.charAt(1)==str2.charAt(index)){
                index++;
                if (index==str2.length()){
                    return true;
                }
            }
        }
        return false;
    }
}

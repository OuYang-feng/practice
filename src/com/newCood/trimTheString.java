package com.newCood;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class trimTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
//        try{
//            String extendName = filename.substring(filename.indexOf("."));
//            System.out.println(extendName.replace(".","").trim());
//        }catch (Exception e){
//            System.out.println("null");
//        }

        String[] extendName = filename.split("\\.");
        if (extendName.length == 1){
            System.out.println("null");
        }else {
            System.out.println(extendName[extendName.length-1]);
        }
    }
}

package com.newCood.Test_4;

import java.util.Arrays;
import java.util.Random;

public class HuiwenNum {
    static int[] array = {1,1,1,3};
    private static int index = 0;

    private boolean ifHuiWenNum(int[] array){
        int[] temp = array;
        for (int i = 0; i < temp.length/2; i++) {
            int num = temp[i];
            temp[i] = temp[temp.length-i-1];
            temp[temp.length-i-1] = num;
        }
        boolean a = Arrays.equals(array,temp);
        return a;
    }

    private void perform(){
        int[] newarr = transformer(array);
        while (this.ifHuiWenNum(newarr)!=true){
            transformer(newarr);
        }
    }

    private int[] transformer(int[] array){
        int max = array.length;
        int min = 0;
        Random random = new Random();
        int x = random.nextInt(max)%(max-min+1) + min;
        int y = x + 1;
        array[x] = array[x] + array[y];
        for (int i = y; i < array.length; i++) {
            array[i] = array[i+1];
        }
        int[] newarr = removeZero(array);
        index++;
        return newarr;
    }

    private int[] removeZero(int[] array){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                j++;
            }
        }
        int[] newarr = new int[j];
        j = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]!=0){
                newarr[j] =array[i];
                j++;
            }
        }
        return newarr;
    }

    public static void main(String[] args) {

        HuiwenNum huiwenNum = new HuiwenNum();
        boolean b =  huiwenNum.ifHuiWenNum(array);
        if (b = true) System.out.println("最少转化次数为0");
        else huiwenNum.perform();
        System.out.println("最少次数: "+index);
    }
}

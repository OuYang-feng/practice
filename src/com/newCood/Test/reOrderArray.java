package com.newCood.Test;

import java.util.Arrays;

/**
 * Created by 78663 on 2017/7/17.
 */
public class reOrderArray {

    static int[] array = new int[]{1,2,3,4,3,6,7};
    static int[] array1 = new int[array.length];
    static int[] array2 = new int[array.length];
    int j,k = 0;
    public void Order(){

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1) {
                array1[j] = array[i];
                j++;
            }else{
                array2[k] = array[i];
                k++;
            }
        }
    }

    int t,m=0;
    public int[] add(int array1[],int array2[]){
        int[] temp = new int[array.length];

        while(array1[m]!=0){
            temp[m] = array1[m];
            m++;
        }
        for (int n = m; n < array2.length; n++) {
            temp[n] = array2[t];
            t++;
        }
//        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i]);
//        }
        return temp;
    }

    public static void main(String[] args) {
        reOrderArray reOrderArray = new reOrderArray();
        reOrderArray.Order();
        System.out.println(Arrays.toString(reOrderArray.add(array1,array2)));
    }
}

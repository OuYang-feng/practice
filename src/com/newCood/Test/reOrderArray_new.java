package com.newCood.Test;

import java.util.Arrays;

/**
 * 奇数全部往前移动一位，除第一个数是奇数之外
 * 偶数放在所有数之后，从最后一位开始。之前来偶数让前面的数都往前移动一位。移动之前判断前一位是不是为空。
 * Created by 78663 on 2017/7/17.
 */
public class reOrderArray_new {
    int[] array={1,2,3,3,5,6};
    int[] array2 = new int[array.length];
    static int j,k=0;
    public int[] sort() {
        if (array[0] % 2 == 0) {
            array2[array.length / 2] = array[0];
            j+=1;
        }else {
            array2[0]=array[0];
            k+=1;
        }

        for (int i = 1; i <array.length ; i++) {

            if (array[i]%2==0){
                array2[array.length/2+j]=array[i];
                j++;
            }else {
                array2[k]=array[i];
                k++;
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        reOrderArray_new reOrderArray_new = new reOrderArray_new();

        System.out.println(Arrays.toString(reOrderArray_new.sort()));

    }
}

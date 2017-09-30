package com.newCood.dongtaiguihua;


/*
     F(1)=1 F(2)=2 F(n)=F(n-1)+F(n-2)
 */
public class climbStairs {
    int[] s = new int[62535];
    public int f(int n) {

        if (n==1) return s[1]=1;
        if (n==2) return s[2]=2;
        if (n>2){
            return s[n]=f(n-1) + f(n-2);
        }
        return -1;
    }
}

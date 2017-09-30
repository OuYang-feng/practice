package com.newCood;

public class stringToInteger {
    public static void main(String[] args) {
        String str = "               ";
        System.out.println(str);
       // System.out.println(new stringToInteger().strToInt(str));
    }
    public int strToInt(String str) {
        int sign = 1,i = 0,base = 0;
        if (str==""){
            return 0;
        }
        char[] chars = str.toCharArray();
        while(chars[i]==' '){
            if (i == chars.length){
                return 0;
            }
            i++;
        }
        if (chars[i]=='+'||chars[i]=='-'){
            sign = chars[i] == '-' ? -1 : 1;
        }
        while (i < chars.length&&chars[i]>='0'&&chars[i]<='9'){
            if (base > Integer.MAX_VALUE/10 ||(base == Integer.MAX_VALUE/10 && chars[i] - '0' > 7)){
                if (sign == 1){
                    return Integer.MAX_VALUE;
                }else
                    return Integer.MIN_VALUE;
            }
            base = 10*base + (chars[i++] - '0');
        }
        return base;
    }
}

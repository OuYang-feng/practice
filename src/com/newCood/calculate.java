package com.newCood;

import java.util.Stack;
/*
    计算简单的四则运算 + - * /
 */
public class calculate {
    public static void main(String[] args) {
        String s = "1 + 1";
        System.out.println(new calculate().calculate(s));
    }
    public int calculate(String s){
        Stack<Integer> stack = new Stack<>();
        if (s.length()==0||s==null){
            return 0;
        }
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                num = 10*num + s.charAt(i)-'0';
            }
            if (s.charAt(i)==' '){
                continue;
            }
            if (!Character.isDigit(s.charAt(i)) || i==s.length()-1 ){
                if (sign == '+'){
                    stack.push(num);
                }if (sign == '-'){
                    stack.push(-num);
                }if (sign == '*'){
                    stack.push(stack.pop()*num);
                }if (sign == '/'){
                    if (num==0){
                        return 0;
                    }else {
                        stack.push(stack.pop()/num);
                    }
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int sum = 0;
        for (Integer k : stack){
            sum += k;
        }
        return sum;
    }
}

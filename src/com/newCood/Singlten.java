package com.newCood;

//����ģʽ
public class Singlten {
    private Singlten () {}
    private static Singlten s = new Singlten();
    public static Singlten getS() {
        return s;
    }
}
//����ģʽ
class Singlten2{
    private Singlten2(){}
    private static Singlten2 singlten2;
    public static Singlten2 getSinglten2() {
        if (singlten2==null){singlten2=new Singlten2();}
        return singlten2;
    }
}

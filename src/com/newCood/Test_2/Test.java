package com.newCood.Test_2;

public class Test {

	public static void main(String[] args) {
	try{
		Object obj = new Object();
		synchronized(Thread.currentThread())
		{
//		 	obj.wait();
			obj.wait();
		 	obj.notify();
		}
		}catch(Exception e){
		System.out.println("There are an error!");
	}

	}
}

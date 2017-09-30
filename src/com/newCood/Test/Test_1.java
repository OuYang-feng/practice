package com.newCood.Test;

public class Test_1 {
	enum AccountType{
		SAVING, FIXED, CURRENT;
		private AccountType(){
			System.out.println("it is a account type");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AccountType.FIXED);
	}

}

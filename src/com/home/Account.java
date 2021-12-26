package com.home;

public class Account {
	private int acc_num;
	private String acc_name;
	double balance;
	//constructor to initialize the values
	Account(int acc_num1,String acc_name1){
		acc_num = acc_num1;
		acc_name = acc_name1;
		balance=0;
		
	}
	
	public void  deposit(double amt) {
		 balance = balance+amt;
		
	}
	public double get_balance() {
		return balance;
	}
	public void withdrawl(double amt) {
		if(amt<=balance) {
			balance=balance-amt;
			System.out.println("The balance after withdrawl is:"+balance);
		}
			
		else if(balance==0){
			System.out.println("the balance in your account is 0");
			}
		else {
			System.out.println("The amount you entered is greater than your current balance");
		}
		
			
		}//end of main

}//end of class

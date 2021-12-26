package com.home;

import java.util.Scanner;

public class Account_Demo {

	public static void main(String[] args) {
		System.out.println("Enter the Account number:");
		
		Scanner input1 = new Scanner(System.in);
		int acc_num=input1.nextInt();
		
		System.out.println("Enter the Account holder name:");
		
		Scanner input2 = new Scanner(System.in);
		String acc_name=input2.next();
		
		Account A1 = new Account(acc_num,acc_name);
		System.out.println("The balance of the account is:"+A1.balance);
		
		System.out.println("Enter the money you want to deposit:");
		Scanner input3 = new Scanner(System.in);
		double amt1=input3.nextInt();
		A1.deposit(amt1);
		System.out.println("The amount in your account after deposit is:"+A1.get_balance());
		
		System.out.println("Enter the money you want to withdraw:");
		Scanner input4 = new Scanner(System.in);
		double amt2=input4.nextDouble();
		A1.withdrawl(amt2);
		System.out.println(A1.toString());
		
		
		
		
		
		

	}

}

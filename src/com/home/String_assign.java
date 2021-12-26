package com.home;

public class String_assign {
	

	public static void main(String[] args) {
		String s1 = "Java Programming";
		int count = 0;
		int count1=0;
		int count2=0;
		//char s = 'a';
		//find number of character occurences
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a') {
			count++;
			}//end of if
			
		}//end of for
		System.out.println("No of \'a\' in word \"Java Programming\" are:"+count);
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				count1++;
			}
			else
				count2++;
				
				}//end of for
		System.out.println("No of vowels in \"Java Programming\" are:"+count1);
		System.out.println("No of consonants in \"Java Programming\" are:"+count2);
		
		}//end of main

}//end of class

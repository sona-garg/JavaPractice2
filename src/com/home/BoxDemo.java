package com.home;

import java.util.Scanner;

public class BoxDemo {

	public static void main(String[] args) {
		Box B1 = new Box();
		System.out.println("The length of the Box is"+B1.getlength());
		System.out.println("The length of the Box is"+B1.getwidth());
		System.out.println("The length of the Box is"+B1.getheight());
		//calling constructor with single parameter
		System.out.println("Enter the side:");
		Scanner input = new Scanner(System.in);
		double side= input.nextInt();
		Box B2 = new Box(side);
		System.out.println("The volume of the cube with side "+side+" is "+B2.cubeVol());
		Box B3 = new Box(2,3,4);
		System.out.println("The volume of the cube with side "+side+" is "+B3.cubeVol());
		
		

	}

}

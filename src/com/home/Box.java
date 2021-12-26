package com.home;

public class Box {
	private double length;
	private double width;
	private double height;
	private double volume;
	//non paramertized constructor
	Box(){
		length=0;
		width=0;
		height=0;
	}
	public double getlength() {
		return length;
	}
	public double getwidth() {
		return width;
	}
	public double getheight() {
		return height;
	}
	
	//constructor with one parameter
	
	Box(double cube){
		length=cube;
		width=cube;
		height=cube;
	}
	
	//constructor with three parameters
	Box(double len,double wid,double hgt){
		
		length=len;
		width=wid;
		height=hgt;
	}
	//calculate volume of cube
		public double cubeVol() {
			return length*width*height;
		}
	

}

package com.jbk;

public class Maruti800 extends Maruti{
	public Maruti800() {
		System.out.println("constructor of class Maruti800");
		
	}
	public void speed() {
		System.out.println("Max speed 80kmph");
		
	}
	public static void main(String[]args) {
		Maruti800 obj=new Maruti800();
		obj.VehicleType();
		obj.brand();
		obj.speed();
		
	}
}

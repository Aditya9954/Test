package com.jbk;

public class Area {
	void find(int I,int b) {
		System.out.println("Area is "+(I*b));
	}
	void find(int I,int b,int h) {
		System.out.println("Area is "+(I*b*h));
	}
	public static void main(String[] args) {
		Area ar=new Area();
		ar.find(8, 5);
		ar.find(4, 6, 2);
	}
}

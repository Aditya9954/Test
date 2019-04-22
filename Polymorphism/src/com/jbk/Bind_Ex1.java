package com.jbk;

public class Bind_Ex1 {
	String text="Bind_Ex1's";
	void display() {
	System.out.println(text+"function called");
}
	}
class SubClass1 extends Bind_Ex1{
	void display()
	{
		super.display();
		text="SubClass1's";
		System.out.println(text+"Function called");
	}
	
}
class SubClass2 extends SubClass1{
	void dispay()
	{
		super.display();
		text="SubClass2's";
		System.out.println(text+"Function called");
	}
	
}
class MainClass{
	public static void main(String[] args)
	{
		SubClass2 obj=new SubClass2();
		obj.display();
	}
}
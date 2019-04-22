package com.jbk;

public class BaseClass {
	
	public void method() {
		System.out.println("I m the method of BaseClass");
				}
}	
	
	public class DerivedClass extends BaseClass{
		public void method()
		{
			System.out.println("I m method of Drived Class");
		}
	}
	
	public class Override{
		public static void main(String[] args) {
			DerivedClass der=new DerivedClass();
			der.method();
			BaseClass base=new BaseClass();
			base.method();
			
			BaseClass base1= new DerivedClass();
			base.method();
		}
	}



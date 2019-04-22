package com.jbk;

public class Bind_Dynamic {
	
	protected String val;
	void display(String str) {
		val="Base Class Function ".concat(str);
		System.out.println(val);
	}

}
class SubClass extends Bind_Dynamic{
	void display(String Str) {
		if(val==null)
		{
			Str="Drived Class Function".concat(Str);
			System.out.println(Str);
		}
	}
}
class MainClass{
	public static void main(String[]args) {
		SubClass obj=new SubClass();
		obj.display("Called");
		
	}
}

// Now rewrite the Code in SubClass and Check Changes of O/p

//*class SubClass extends Bind_Dynamic
//{
	//void display(Stirng Str) {
		//super.display(Str);
		//if(val==null) {
			//str="Derived Class Function".concat(str);
			//System.out.println(str); 
				
		//}
	//}
//}

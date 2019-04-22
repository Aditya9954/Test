package com.jbk;

public class Override {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Bank Rate of Intrest:" + b.getRateOfInterest() + "%");
		Bank b1 = new Sbi();
		Bank b2 = new ICICI();
		Bank b3 = new Axis();
		System.out.println("SBI Rate Of Interst:" + b1.getRateOfInterest() + "%");
		System.out.println("ICICI Rate Of Interst:" + b2.getRateOfInterest() + "%");
		System.out.println("Axis Rate Of Interst:" + b3.getRateOfInterest() + "%");

	}

}

class Bank {

	int getRateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 10;
	}
}

class Axis extends Bank {
	int getRateOfInterest() {
		return 11;
	}
}

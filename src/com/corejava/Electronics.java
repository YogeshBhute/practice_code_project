package com.corejava;

class Computer {

	Computer() {
		System.out.println("Parent Constructor");
	}
}

class Laptop extends Computer {

	Laptop() {
		System.out.println("Child Constructor");
	}
}

public class Electronics {

	public static void main(String args[]) {

		Computer c = new Computer();

		Computer c1 = new Laptop();

		Computer c2 = (Laptop) new Computer();

		Laptop l = new Laptop();

		Laptop l2 = (Laptop) new Computer();

		// Laptop l1 = new Computer(); --- Not allowed

		// Laptop l3 = (Computer) new Laptop(); --- Not allowed
	}
}
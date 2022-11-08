package com.corejava.designpatterns;

import java.util.Arrays;
import java.util.List;

public class MySingleton {

	public static void main(String[] args) {
		Singleton obj = Singleton.getSingleton("Win", 12);
		System.out.println(obj);

		Singleton obj1 = Singleton.getSingleton("Win", 12);
		System.out.println(obj1);
	}
}
 
class Singleton {

	private String name;
	private int age;

	private static Singleton single = null;

	private Singleton() {
	}

	public static Singleton getSingleton(String name, int age) {

		if (single == null)
			single = new Singleton();

		return single;
	}

}
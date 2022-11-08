package com.corejava.java8features;

public interface MyFunctionalInterface {
	public abstract void mySingleAbstractMethod();

	public default String myDefaultMethod() {
		return "My Default Method";
	}

	public static void myStaticMethod() {
		System.out.println("My static Method");
	}
}

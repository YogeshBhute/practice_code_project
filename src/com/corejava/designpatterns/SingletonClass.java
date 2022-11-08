package com.corejava.designpatterns;

import java.io.Serializable;

public class SingletonClass implements Serializable {

	//Lazy Initialization - creation of instance when required.
	private static SingletonClass singletonObjectLazy;
	
	//Early Instantiation: creation of instance at load time.
	private static SingletonClass singletonObjectEager = new SingletonClass(); 

	private SingletonClass() {
	} // Private Constructor

	public static SingletonClass getSingletonInstance() {
		if (null == singletonObjectLazy) {
			singletonObjectLazy = new SingletonClass();
		}
		return singletonObjectLazy;
	}

	public static void main(String[] args) {
		SingletonClass stonObject = SingletonClass.getSingletonInstance();
		System.out.println(stonObject.toString());

		SingletonClass stonObject1 = SingletonClass.getSingletonInstance();
		System.out.println(stonObject1.toString());
	}
}

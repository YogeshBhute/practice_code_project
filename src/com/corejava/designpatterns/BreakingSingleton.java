package com.corejava.designpatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.imageio.stream.FileImageInputStream;

public class BreakingSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {

		SingletonClass originalObject = SingletonClass.getSingletonInstance();
		System.out.println("Hashcode for Original Object :" + originalObject.hashCode());

		SingletonClass duplicateObject = SingletonClass.getSingletonInstance();
		System.out.println("Hashcode for Duplicate Object :" + duplicateObject.hashCode() + "\n");

		// Using Reflection to break Singleton
		System.out.println("Using Reflection to break Singleton \n");

		Class<?> singletonClass = Class.forName("com.corejava.singleton.SingletonClass");
		Constructor<SingletonClass> constructor = (Constructor<SingletonClass>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonClass brokenWithReflection = constructor.newInstance();

		System.out.println("Hashcode for Original Object :" + originalObject.hashCode());
		System.out.println(
				"Hashcode for Singleton Object broken with Reflection :" + brokenWithReflection.hashCode() + "\n");

		// Using Reflection to break Singleton
		System.out.println("Using Serialization to break Singleton \n");

		// Serialization

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("H:\\Serialize.ser"));
		objectOutputStream.writeObject(originalObject);
		objectOutputStream.close();

		// De-serialization
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("H:\\Serialize.ser"));
		SingletonClass brokenWithSerialization = (SingletonClass) objectInputStream.readObject();
		System.out.println("Hashcode for Original Object :" + originalObject.hashCode());
		System.out.println("Hashcode for Singleton Object broken with Serialization :" + brokenWithSerialization.hashCode() + "\n");

	}

}

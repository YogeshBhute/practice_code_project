package com.corejava.java8features;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		String str1 = new String("ABC");
		String str2=null;
		
		Optional<String> emptyStr = Optional.empty();
		System.out.println(emptyStr);
		
		Optional<String> nullableStr = Optional.of(str1);
		System.out.println(nullableStr);
		
		Optional<String> ofStr = Optional.ofNullable(str1); 
		ofStr.ifPresentOrElse(value -> System.out.println("Found Value :-" +value), 
				() -> System.out.println("Value Not Found"));
		
		
		System.out.println(nullableStr.get());
		//System.out.println(emptyStr.get());
	}

}

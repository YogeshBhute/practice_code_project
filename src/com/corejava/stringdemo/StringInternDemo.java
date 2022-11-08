package com.corejava.stringdemo;

public class StringInternDemo {

	public static void main(String[] args) {

		String str1 = "Coding";
		String str2 = new String("Coding");
		String str3 = str2.intern();
		String str4 = "Hello Coding";
		
		System.out.println(str3);
		System.out.println(str1);
		
		System.out.println("str1.equals(str2) :- " +str1.equals(str2));
		
		System.out.println("str1 == str2 :- " +(str1 == str2));

		System.out.println("str1 == str3 :- " +(str1 == str3));

		System.out.println("str3 == str2 :- " +(str3 == str2));


		

		//String str5 = str2;
		//System.out.println(str1 == str5);
		//System.out.println(str1 == str5);
		//System.out.println(str1 == str5)
	}
}

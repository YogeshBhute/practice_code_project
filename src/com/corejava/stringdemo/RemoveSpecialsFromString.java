package com.corejava.stringdemo;

public class RemoveSpecialsFromString {

	public static void main(String[] args) {

		String str = "Please@Remove%the!Special^Charecters&from$this$String.";
		String output = " ";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(str.charAt(i))) {
				output = output + str.charAt(i);
			} else {
				output = output + " ";
			}
		}
		
		System.out.println(output.trim());

		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);

		str = str.replaceAll("[-+^]*", "");
		System.out.println(str);

		String strNoSpecialChars="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) <= 122) {
				strNoSpecialChars = strNoSpecialChars + str.charAt(i);
			}  else {
				strNoSpecialChars = strNoSpecialChars + " ";
			}
		}
		System.out.println(strNoSpecialChars);
		
		String strWithMultipleSpaces = "Please    Remove    the extra    spaces     from this    String."; 
		System.out.println(strWithMultipleSpaces.trim().replaceAll("( )+", " "));
	}
	
	

}

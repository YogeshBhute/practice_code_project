package com.corejava;

public class RemoveSpecialChars {

	public static void main(String[] args) {

		String string = "This#is$my%first^discussion@with&&Altimetrik&&in*this**Month**";

		string = string.replaceAll("[^a-zA-Z0-9]", " ");

		System.out.println(string);

		// Output: This is my first discussion with Altimetrik in this Month

		
		String output = "";

		for (int i = 0; i < string.length(); i++) {

			if (Character.isLetter(string.charAt(i))) {

				output = output + string.charAt(i);
			} else {

				output = output + " ";
			}
		}
		System.out.println(output);
	}

}

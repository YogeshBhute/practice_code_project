package com.corejava.stringdemo;

public class RevString {

	public static void main(String[] args) {

		String str = "Yogesh Charandas Bhute", nstr = "";
		char ch;

		String[] words = str.split(" ");

		for (String word : words) {

			StringBuffer sb = new StringBuffer();
			sb.append(word);
			System.out.println(sb.reverse());

		}

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println(nstr);

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str);
		System.out.println(strBuilder.reverse());

		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.println(strBuffer.reverse());
	}

}

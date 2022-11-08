package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] numbers = { 12, 23, 32, 44, 56, 55, 44, 34, 76 };
		String[] letters = { "A", "B", "C", "D", "E" };

		// List list = Arrays.asList(numbers); -- asList() do not work for primitives.
		List letterList = Arrays.asList(letters);
		System.out.println(letterList);
		System.out.println(letterList.size());

		// to convert primitive integer array to list of Integer using traditional for loop
		List numList = new ArrayList(numbers.length);

		for (int i : numbers) {
			numList.add(Integer.valueOf(i));
		}
		System.out.println(numList);
		System.out.println(numList.size());
		
		// to convert primitive integer array to list of Integer using stream
		List listUsingStream = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		System.out.println(listUsingStream);
		System.out.println(listUsingStream.size());
	}

}

package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingOccurances {

	public static void main(String[] args) {

		List<Integer> listA = Arrays.asList(1,4,2,3,3,4,7);
		String[] listB = { "Google", "Apple", "Amazon", "Google", "Adobe", "Amazon", "Google", "Cisco", "Apple",
		"Amazon" };
		
		List distList = listA.stream().distinct().collect(Collectors.toList());
		System.out.println(distList);
		
		Map<Integer, Object> result1 = listA.stream().distinct()
				.collect(Collectors.toMap(Function.identity(), token -> Collections.frequency(listA, token)));
		System.out.println(result1);
		
		
		Map<String, Long> result2 = Arrays.stream(listB).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result2);		
		
		

	}

}

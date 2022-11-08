package com.corejava.java8features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods2 {

	public static void main(String[] args) {
		String[] listA = { "the", "you", "how" };
		String[] listB = { "the dog ate the food", "how is the weather", "how are you" };
		String[] listC = { "Google", "Apple", "Amazon", "Google", "Adobe", "Amazon", "Google", "Cisco", "Apple"};

		Set<String> qualified = new HashSet<>(Arrays.asList(listA)); // make searching easier
		System.out.println(qualified);

		Map<String, Long> map = Arrays.stream(listB) // stream the sentences
				.map(sentence -> sentence.split("\\s+")) // split by words to Stream<String[]>
				.flatMap(words -> Arrays.stream(words) // flatmap to Stream<String>
						.distinct()) // ... as distinct words by sentence
				.filter(qualified::contains) // keep only the qualified words
				.collect(Collectors.groupingBy( // collect to the Map
						Function.identity(), // ... the key is the words itself
						Collectors.counting())); // ... the value is its frequency
		System.out.println(map);

		
		Map<String, Long> map2 = Arrays.stream(listC)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);
	}

}

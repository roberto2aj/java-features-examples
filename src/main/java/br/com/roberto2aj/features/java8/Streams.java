package br.com.roberto2aj.features.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class is used to explain a bit of streams.
 * @author roberto
 *
 */
public class Streams {

	public static void main(String[] args) {
		// Streams gives us a way to pipeline operations on a collection using lambda
		// Let's take, for example, this list
		var words = Arrays.asList("deer", "crocodile", "cat", "eagle", "ox");

		// Let's say we want to process it into a list of integers
		// where each number corresponds to each word's length,
		// and filter so it only has even numbers.
		// We'd write something like this:
		var wordLengths = new ArrayList<>();
		for (String word : words) {
			if (word.length() %2 == 0) {
				wordLengths.add(word.length());
			}
		}
		System.out.println(wordLengths);

		// If we used streams, we could to something like this:
		var wordLengths2 = words.stream()
								.map(w->w.length())
								.filter(l -> l%2==0)
								.collect(Collectors.toList());
		System.out.println(wordLengths2);

		// If we call a single operation which doesn't reference external variables,
		// we can instead use another syntax: Class::operation
		var wordLengths3 = words.stream()
				.map(String::length)
				.filter(l -> l%2==0)
				.collect(Collectors.toList());
		System.out.println(wordLengths3);

		// Another example, which just prints each object without ever assigning it to a variable
		words.stream().map(String::length)
				.filter(l -> l%2 ==0)
				.forEach(System.out::println);
	}
}

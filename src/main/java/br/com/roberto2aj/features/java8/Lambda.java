package br.com.roberto2aj.features.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class is used to show a little bit of the lambda calculus implementation
 * in java.
 * @author roberto
 *
 */
public class Lambda {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("deer", "crocodile", "cat", "eagle", "ox");

		//A good problem to illustrate Java uses is sorting lists.
		//Let's take vowels as an example.
		//For the class implements the Comparable interface, we can use 
		// Collections.sort method:
		Collections.sort(words);
		System.out.println(words);

		// But what would happen if we wanted to sort from the shortest word to the longest?
		// We could use an anonymous inner class
		words.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(words);

		// The comparator interface is what we call an function interface, that is
		// a interface which has only a single method. It is a very verbose code.
		// Lambda let's us pass methods as parameters, giving us a way cleaner way of 
		// solving tjis problem.
		words = Arrays.asList("deer", "crocodile", "cat", "eagle", "ox");
		Comparator<String> sortUsingLength = (s1, s2) -> s1.length() - s2.length();
		words.sort(sortUsingLength);
		System.out.println(words);

		//We don't even need to create the object, we can insert the Comparator implementation
		//Directly into sort() call.
		words = Arrays.asList("deer", "crocodile", "cat", "eagle", "ox");
		words.sort((s1, s2) -> s1.length() - s2.length());
		System.out.println(words);

		//Together with Streams, the possibilities are endless.
	}
}

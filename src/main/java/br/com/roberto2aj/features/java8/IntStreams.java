package br.com.roberto2aj.features.java8;

import java.util.stream.IntStream;

public class IntStreams {

	public static void main(String[] args) {
		/* Int streams are a special type of Stream in java which 
		 * only apply to a collection of Integers.
		 * 
		 * A useful method is the method range, which let us do 
		 * all kind of fun things.
		 * 
		 * Let's say we want to print every number from 1 to 100.
		 */

		// Old way of doing this:
		for (int i = 1; i <=100; i++) {
			System.out.println(i);
		}

		// New way. Much better. :)
		IntStream.range(0, 101).forEach(n -> System.out.println(n));

		// This one is also an option. :)
		IntStream.rangeClosed(0, 100).forEach(n -> System.out.println(n));

		// You can also do all kinds of operations you can do in a Stream, 
		// like filtering.
		// Let's print every even number from 0 to 100.
		IntStream.rangeClosed(0, 100)
			.filter(n -> n%2==0)
			.forEach(n -> System.out.println(n));

		// Or mapping
		// Let's print the triple of every number from 0 to 100.
		IntStream.rangeClosed(0, 100)
		.map(n -> n*3)
		.forEach(n -> System.out.println(n));

		// We can also  it into a regular Stream
		// Let's print every number from 0 to 100 along with its triple.
		IntStream.rangeClosed(0, 100)
		.mapToObj(x -> x)
		.map(x -> "The triple of " + x + " is " + x*3)
		.forEach(n -> System.out.println(n));

		// There's also some specific operations, like sum or average.
		System.out.println(IntStream.rangeClosed(0, 100).sum());
		System.out.println(IntStream.rangeClosed(0, 100).average().getAsDouble());
		System.out.println(IntStream.rangeClosed(0, 100).min().getAsInt());
		System.out.println(IntStream.rangeClosed(0, 100).max().getAsInt());
	}
}

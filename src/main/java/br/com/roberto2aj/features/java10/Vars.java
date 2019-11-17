package br.com.roberto2aj.features.java10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to show the new keyword "var" introduced in Java 10.
 * 
 * @author roberto
 *
 */
public class Vars {

	/*
	 * var is a new type in Java which is used to define variables without the need
	 * to define a type. It can't be used to define class attributes, so
	 * uncommenting this declaration will generate a compile error.
	 */
	// var x = 2;

	public static void main(String[] args) {

		// The following line, however, is okay.
		var x = 2;

		// Despite being a reserved type name, var is not a keyword.
		// This means you can create a variable named var.
		// This decision was made probably in order to not break legacy code.
		int var = 5;

		// Still, you can't change the type of a var.
		var y = 10;
		// y = "10"; // So uncommenting this line will generate an error.

		// The fun starts when you start working with more complex types.
		// First, it reduces repetition and makes declaration way more concise.

		// Old way (Java 5)
		List<ArrayList<Integer>> java5 = new ArrayList<ArrayList<Integer>>();

		// Old way (post Java 5 but before Java 10)
		List<ArrayList<Integer>> postJava6 = new ArrayList<>();

		// New way
		var postJava10 = new ArrayList<ArrayList<Integer>>();

		// The compiler will assign the closest superclass possible.
		// In this case, this List is a List<Number>
		var oneRepresentations = List.of(1, 1L, 1.0, BigDecimal.ONE);

		// And in this case, this List is a List<Object>
		var zeroRepresentations = List.of(0, 0L, 0.0, "0");

		var this_ = 0;
		var also = 0;
		var means = 0;
		var aligned = 0;
		var variable = 0;
		var names = 0;
	}
}

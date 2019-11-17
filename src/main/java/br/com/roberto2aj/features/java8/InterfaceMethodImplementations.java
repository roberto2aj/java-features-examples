package br.com.roberto2aj.features.java8;

public interface InterfaceMethodImplementations {

	// From Java 8 onwards, interfaces can have method implementations.
	// They must either have default access or be static.
	// It's advantageous in order to promote code reuse.
	public default void myInterfacePrint(String s) {
		System.out.println(s);
	}
}

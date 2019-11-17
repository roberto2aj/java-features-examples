package br.com.roberto2aj.features.java9;

public interface PrivateInterfaceMethods {

	// In Java 9, classes can now have private method implementations.
	public default void publicPrint(String s) {
		privatePrint(s);
	}

	private void privatePrint(String s) {
		System.out.println(s + "!");
	}
}
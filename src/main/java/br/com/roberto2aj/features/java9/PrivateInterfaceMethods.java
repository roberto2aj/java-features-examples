package br.com.roberto2aj.features.java9;

public interface PrivateInterfaceMethods {

	// In Java 9, classes can now have private method implementations.
	// This is useful in order to be able to write more robust code.
	public default void publicPrint(String s) {
		privatePrint(privateTransformString(s));
	}

	private String privateTransformString(String s) {
		return s + "?";
	}

	private void privatePrint(String s) {
		System.out.println(s + "!");
	}
}
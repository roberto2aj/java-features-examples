package br.com.roberto2aj.features.java13;

/**
 * This class is used to show the text block feature of Java 13. This is a
 * preview feature, so in order to use it, you need to enable preview features.
 * 
 * @author roberto2aj
 *
 */
public class TextBlock {

	public static void main(String[] args) {
		String textBlockOld = "This is how\n" + 
							  " we used to make multi-line String\n" +
				              " variables.";
		System.out.println(textBlockOld);

		String textBlockNew = """
							  In Java 13, by using three double quotes,
							   we can write multi-line Strings in a way
							   easier and readable way. 
							  """;
		System.out.println(textBlockNew);

		String textBlockOldIndented = "Making indented Strings \n" +
									  "  was also a bit akward, specially \n " + 
				                      "    if you wanted to keep your code clean.\n " + 
									  "  The plus signs are ugly and\n " +
				                      " ctrl+shift+F will actully make your code\n " + 
									  " harder to read. ";

		System.out.println(textBlockOldIndented);

		String textBlockNewIndented = """
									  Making indented Strings 
									     using text blocks is way, 
									               way
									    easier and the code is much, much cleaner. 
									  """;

		System.out.println(textBlockNewIndented);

		String indentation1 = """
						The indentation of the lines all depends 
						 solely on the position of the first line.
                        """;

		String indentation2 = """
				The indentation of the lines all depends 
				 solely on the position of the first line.
               """;
		System.out.println(indentation1);
		System.out.println(indentation2);

	}

}

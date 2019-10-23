
public class HelloWorld_Recursion {

	public static String recursivePrintStringMultipleLines(String str, int count) {
		if (count == 0)
			return str;

		// decrement the counter each time
		return str + "\n" + recursivePrintStringMultipleLines(str, --count);
	}

	public static String recursivelyDecomposeString(String str) {
		if (str.length() == 0)
			return "";
		return str + "\n" + recursivelyDecomposeString(str.substring(0, str.length() - 1));
	}

	public static String recursivelyGrowString(String str, int counter) {

		if (str.length() == counter)
			return str;

		return str.substring(0, counter) + "\n" + recursivelyGrowString(str, ++counter);
	}

	public static void main(String args[]) {

		// 1. Print "Hello, World" multiple times using an integer parameter
		int printCount = 4;
		System.out.println(recursivePrintStringMultipleLines("Hello, World!", printCount));
		System.out.println("\n\n");

		// 2. Decompose "Hello, World" character by character
		System.out.println(recursivelyDecomposeString("Hello, World!"));

		// 3. Grow "Hello, World" character by character
		System.out.println(recursivelyGrowString("Hello, World!", 0));
	}
}

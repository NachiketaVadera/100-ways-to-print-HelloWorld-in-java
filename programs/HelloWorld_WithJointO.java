/*
 * Program: Hello World With Joint O
 * Author: adizcode a.k.a Advitiay Anand
 */

public class HelloWorld_WithJointO {
	
	// Main method
	public static void main(String[] args) {
		
		// Draw HELLO WORLD with a joint O
		for (int i = 1; i <= 4; i++) {
			
			// Line to be drawn
			String line = "";
			
			if (i == 1 || i == 4) {
				
				line = "      ...";
				
			} else if (i == 2) {
				
				line = "HELL .   .";
				
			} else {
				
				// if i == 3
				line = "   W .   . ORLD";
				
			}
			
			// Draw line
			System.out.println(line);
		}
	}
}

//case sensetive!

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld_SearchChar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char: ");
		char c = sc.next().charAt(0);
		String s = "Hello World";
		String indexes = "";
		int i;
		for(i=0; i<s.length(); i++){
			if(c == s.charAt(i)){
				if(indexes.isEmpty()){
					indexes = indexes+" "+i;
				}
				else{
					indexes = indexes+" and "+i;
				}
			}
		}
		if(indexes.isEmpty()){
			System.out.println("Char not found!");
		}
		else{
			System.out.println("Char found at index"+ indexes);
		}
	}
}

import java.util.*;

public class HelloWorld_UsingQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque<>();
		String a ="Hello, World!";
		for(int i=0;i<a.length();i++) {
			q.add(a.charAt(i));
		}
		
		String ans="";
		for(int i=0;i<a.length();i++) {
			ans+=(q.poll());
		}
		
		System.out.println(ans);
	}

}

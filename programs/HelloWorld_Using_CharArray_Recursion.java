public class HelloWorld_Using_CharArray_Recursion {

	public static void main(String[] args) {
		char array[] = {'H','E','L','L','O',',',' ','W','O','R','L','D','!'};
		int i = 0;
		hello_world(array, i);
	}

	public static void hello_world(char helloworld[], int i) {
		System.out.print(helloworld[i]);
		i++;
		if(i==helloworld.length) { return; }
		else { hello_world(helloworld, i); }
	}
}

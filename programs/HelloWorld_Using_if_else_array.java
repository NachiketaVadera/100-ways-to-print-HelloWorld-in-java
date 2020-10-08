package code;

public class HelloWorld_Using_if_else_array {

	public static void main(String[] args) {
		String h = "H";
		String e = "e";
		String l = "l";
		String o = "o";
		String w = "W";
		String r = "r";
		String d = "d";
	
		String[] arr = new String[11];
   arr[0] = h;
	if(arr[0] == h) {
			arr[1] = e; 
		}if(arr[1] == e) {
			arr[2] = l;
			arr[3] = l;
		}if(arr[3] == l) {
			arr[4] = o;
		}if(arr[4] == o) {
			arr[5] = " ";
		}if(arr[5] == " ") {
			arr[6] = w;
		}if(arr[6] == w) {
			arr[7] = o;
		}if(arr[7] == o) {
			arr[8] = r;
		}if(arr[8] == r) {
			arr[9] = l;
		}if(arr[9] == l) {
			arr[10] = d;
		}

		for(int i = 0;i<=10;i++) {
			System.out.print(arr[i]);
		}
		
		
	}

}

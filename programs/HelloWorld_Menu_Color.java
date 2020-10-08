import java.util.Scanner;

public class Hello_world_menu_color {
	
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    
	public static void main(String[] args) {
		System.out.println("Choose a color: \n1. Red\n2. Green\n3. Yellow");
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		
		switch(res) {
		case 1:
			System.out.println(RED + "Hello World");
			break;
			
		case 2:
			System.out.println(GREEN + "Hello World");
			break;
			
		case 3:
			System.out.println(YELLOW + "Hello World");
			break;
			
		default:
			System.out.println(RED + "Hello World");
			break;
		}
	}

}

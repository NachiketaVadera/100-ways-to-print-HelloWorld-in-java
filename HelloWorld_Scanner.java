import java.util.Scanner;

public class HelloWorld_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        System.out.println("*For exit print: \"exit\"\n");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            if ("Hello, World".equals(input)) {
                System.out.println(input);
            } else {
                System.out.println("This program only prints \"Hello, World\"\n");
            }
        }
    }
}

import java.util.Scanner;

public class HelloWorld_Assertion {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter [Hello, World!]:");
                String text = input.nextLine();

                assert text.equals("Hello, World!") : "Trigger: TextNotHelloWorldException";

                System.out.println("Good, text is 'Hello, World!'");
        }
}

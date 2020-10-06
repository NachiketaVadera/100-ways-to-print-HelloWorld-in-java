public class HelloWorld_CustomException {
        public static void main(String[] args) {
                System.out.println("Enter a greeting: ");
                String input = new java.util.Scanner(System.in).nextLine();
                try {
                        if (!input.equals("Hello, World!")) {
                                throw new NotHelloWorldException();
                        } else {
                                System.out.println("That's right ;)");
                        }
                } catch(NotHelloWorldException ex) {
                        System.out.println(ex.toString());
                }
        }
}

class NotHelloWorldException extends RuntimeException {
        public NotHelloWorldException() {
                super();
        }
}

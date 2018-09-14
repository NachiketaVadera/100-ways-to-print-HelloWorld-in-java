public class HelloWorld_Interface {
        public static void main(String[] args) {
                new PrintHelloWorld().printHelloWorld();
        }
}

interface HelloWorldPriter {
        public void printHelloWorld();
}

class PrintHelloWorld implements HelloWorldPriter {
        public void printHelloWorld() {
                System.out.println("Hello, World!");
        }
}

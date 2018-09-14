public class HelloWorld_Multiple_Inheritance {
        public static void main(String[] args) {
                new UsingHW_Printer();
        }
}

class HW_Printer {
        public static void printHelloWorld() {
                System.out.println("Hello, World!");
        }
}

class UsingHW_Printer extends Printer {
        public UsingHW_Printer() {
                printHelloWorld();
        }
}

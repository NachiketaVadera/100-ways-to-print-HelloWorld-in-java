public class HelloWorld_CommandLineArgs {
        public static void main(String[] args) {
                if (args.length == 0) {
                        System.out.println("Type \"Hello, World!\" to see the output");
                }
                else if (args.length == 1 && String.valueOf(args[0]).equals("Hello, World!")) {
                        System.out.println("Hello, World!");
                }
                else {
                        System.out.println("Goodbye, World | :'(");
                }
        }
}

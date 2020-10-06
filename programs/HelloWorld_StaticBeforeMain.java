        public class HelloWorld_StaticBeforeMain {
        
        static {
                System.out.print("Hello, ");
        }
        
        public static void main(String[] args) {
                System.out.print("World!");
        }
}
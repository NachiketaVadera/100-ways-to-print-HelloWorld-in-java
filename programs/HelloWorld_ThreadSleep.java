public class HelloWorld_ThreadSleep {
        public static void main(String[] args) {
                int i = 5;
                while (i != 0) {
                        System.out.println("Wait " + i +" seconds to see the magic!");
                        try {Thread.sleep(1000);} catch(Exception ex) {}
                        i--;
                }
                System.out.println("Hello, World!");
        }
}

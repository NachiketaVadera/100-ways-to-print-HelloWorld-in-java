import java.util.Random;

public class HelloWorld_RunnableAnimation {
        public static void main(String[] args) {
                new Runner();
        }
}

class Runner implements Runnable {
        public Runner() {
                new Thread(this, "thread_delay").start();
        }

        public void run() {
                String message = "Hello, World!";
                for (int i = 0;i < message.length();i++) {
                        System.out.print(message.toCharArray()[i]);
                        try {
                                Thread.sleep(new Random().nextInt(400));
                        } catch(Exception ex) {
                                System.out.println(ex.getMessage());
                        }
                }
        }
}

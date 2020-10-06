import java.util.concurrent.*;

public class HelloWorld_Using_Callable {

    public static void main(String args[]){

        HelloWorld helloWorld = new HelloWorld();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Future<String> futureHelloWorld = threadPoolExecutor.submit(helloWorld);
        try {
            System.out.println(futureHelloWorld.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            threadPoolExecutor.shutdown();
        }

    }
}

class HelloWorld implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello World!";
    }
}

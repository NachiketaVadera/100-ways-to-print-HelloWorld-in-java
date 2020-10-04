import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by IntelliJ IDEA.
 * User: rsv
 * Date: 03.10.2020
 * Time: 22:38
 */
public class HelloWorld_Concurrent {

    public static void main(final String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        String str = "Hello World!";
        int length = str.length();
        ExecutorService executor = Executors.newFixedThreadPool(length);
        List<Callable<Void>> callables = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(length);
        for (int i = 0; i < length; i++) {
            int finalI = i;
            callables.add(() -> {
                while (true) {
                    if (atomicInteger.get() == finalI) {
                        System.out.print(str.charAt(finalI));
                        atomicInteger.incrementAndGet();
                        countDownLatch.countDown();
                        break;
                    }
                }
                return null;
            });
        }
        executor.invokeAll(callables);
        countDownLatch.await();
    }
}

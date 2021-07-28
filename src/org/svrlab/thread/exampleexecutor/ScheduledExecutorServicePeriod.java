package org.svrlab.thread.exampleexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutorServicePeriod {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Some homework on the main ...");

        AtomicInteger counter = new AtomicInteger(5);
        //CountDownLatch lock = new CountDownLatch(5);
        Future<?> future = executor.scheduleAtFixedRate( () -> {
            System.out.println("Task Hello world ...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
              //  lock.countDown();
                counter.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1000, 2000, TimeUnit.MILLISECONDS);

        // lock.await();
        // future.cancel(true);
        // TimeUnit.SECONDS.sleep( 10);
        while (counter.get() >= 0){
            if (counter.get() == 0){
                future.cancel(true);
                counter.getAndDecrement();
            }
        }

        System.out.println("Some other task in the main ...");
        executor.shutdown();
    }
}

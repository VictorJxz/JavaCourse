package org.svrlab.thread.exampleexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Task start ...");
            try {
                System.out.println("Thread -> "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finish the task ");
        };
        executorService.submit( task );
        executorService.shutdown();
        System.out.println("Continuing with the executor of the main method 1");
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continuing with the executor of the main method 2");
    }
}

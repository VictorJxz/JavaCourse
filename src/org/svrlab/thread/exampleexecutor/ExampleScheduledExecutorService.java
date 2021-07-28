package org.svrlab.thread.exampleexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExampleScheduledExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Some homework on the main ...");

        executor.schedule( () -> {
            System.out.println("Task Hello world ...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },2000, TimeUnit.MILLISECONDS);

        System.out.println("Some other task in the main ...");
        executor.shutdown();
    }
}

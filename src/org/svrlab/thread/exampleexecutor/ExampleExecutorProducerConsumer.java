package org.svrlab.thread.exampleexecutor;

import org.svrlab.thread.examplesync.Bakery;
import org.svrlab.thread.examplesync.runnable.Consumer;
import org.svrlab.thread.examplesync.runnable.Producer;

import java.util.concurrent.*;

public class ExampleExecutorProducerConsumer {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor =(ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("# Pool size -> "+executor.getPoolSize());
        System.out.println("# Amount of task -> "+executor.getQueue().size());

        Bakery bakery = new Bakery();
        Runnable producer = new Producer(bakery);
        Runnable consumer = new Consumer(bakery);

        Future<?> future = executor.submit( consumer );
        Future<?> future2 = executor.submit( producer );

        System.out.println("# Pool size -> "+executor.getPoolSize());
        System.out.println("# Amount of task -> "+executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuing with the executor of the main method 1");


    }
}

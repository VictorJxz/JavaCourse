package org.svrlab.thread.exampleexecutor;

import java.util.concurrent.*;

public class ExampleExecutorFuture2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor =(ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        System.out.println("# Pool size -> "+executor.getPoolSize());
        System.out.println("# Amount of task -> "+executor.getQueue().size());

        Callable<String> task = () -> {
            System.out.println("Task start ...");
            try {
                System.out.println("Thread : "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finish the task ");
            return "Some import result of the task";
        };

        Callable<Integer> task2 = () -> {
            System.out.println("Task[3] start ...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> result = executor.submit( task );
        Future<String> result2 = executor.submit(task);
        Future<Integer> result3 = executor.submit(task2);

        System.out.println("# Pool size -> "+executor.getPoolSize());
        System.out.println("# Amount of task -> "+executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuing with the executor of the main method 1");

        //System.out.println( result.isDone() );
        while (!(result.isDone() && result2.isDone() && result3.isDone() ) ){
            System.out.println(String.format(" result1: %s | result2: %s | result3: %s",
                    result.isDone()? "finish":" in progress",
                    result2.isDone()? "finish":" in progress",
                    result3.isDone()? "finish":" in progress"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("We get the result of the task : "+ result.get() );
        System.out.println("Finish the task : "+ result.isDone() );

        System.out.println("We get the result[2] of the task : "+ result2.get() );
        System.out.println("Finish the task : "+ result2.isDone() );

        System.out.println("We get the result[3] of the task : "+ result3.get() );
        System.out.println("Finish the task : "+ result3.isDone() );
    }
}

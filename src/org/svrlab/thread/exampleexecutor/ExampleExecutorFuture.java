package org.svrlab.thread.exampleexecutor;

import java.util.concurrent.*;

public class ExampleExecutorFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            System.out.println("Task start ...");
            try {
                System.out.println("Thread -> "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finish the task ");
            return "Some import result of the task";
        };
        Future<String> result = executorService.submit( task );
        executorService.shutdown();
        System.out.println("Continuing with the executor of the main method 1");

        //System.out.println( result.isDone() );
        while (!result.isDone() ){
            System.out.println("Executing task ....");
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("We get the result of the task : "+ result.get() );
        System.out.println("Finish the task : "+ result.isDone() );
    }
}

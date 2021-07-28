package org.svrlab.thread;


public class ExampleInterfaceRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable travel = () -> {
                for(int i =0; i < 10; i++) {
                    System.out.println( i+" -> "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() *1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Travel to "+ Thread.currentThread().getName());
                System.out.println( main.getState());
        };

        Thread thread1 = new Thread( travel,"Vancouver Canada" );
        Thread thread2 = new Thread( travel,"Toronto Canada");
        Thread thread3 = new Thread( travel,"Quebec Canada");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        //Thread.sleep(10000);
        System.out.println("Continue with main method -> "+ main.getName());
    }
}

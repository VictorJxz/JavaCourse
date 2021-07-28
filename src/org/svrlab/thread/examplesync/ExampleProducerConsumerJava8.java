package org.svrlab.thread.examplesync;


import java.util.concurrent.ThreadLocalRandom;

public class ExampleProducerConsumerJava8 {

    public static void main(String[] args) {

        Bakery bakery = new Bakery();

        new Thread( () -> {
            for (int i =0; i < 10; i++){
                bakery.make("Bread : # "+i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread( () -> {
            for (int i =0; i< 10; i++){
                bakery.consume();
            }
        }).start();
    }
}

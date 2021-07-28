package org.svrlab.thread.examplesync.runnable;

import org.svrlab.thread.examplesync.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable{

    private Bakery bakery;

    public Producer(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i =0; i < 10; i++){
            this.bakery.make("Bread : # "+i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package org.svrlab.thread.examplesync.runnable;

import org.svrlab.thread.examplesync.Bakery;


public class Consumer implements Runnable{

    private Bakery bakery;

    public Consumer(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i =0; i< 10; i++){
            this.bakery.consume();
        }
    }
}

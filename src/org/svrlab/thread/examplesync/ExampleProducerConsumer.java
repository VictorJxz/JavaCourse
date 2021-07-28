package org.svrlab.thread.examplesync;

import org.svrlab.thread.examplesync.runnable.Consumer;
import org.svrlab.thread.examplesync.runnable.Producer;

public class ExampleProducerConsumer {

    public static void main(String[] args) {

        Bakery bakery = new Bakery();

        new Thread(new Producer(bakery)).start();
        new Thread(new Consumer(bakery)).start();
    }
}

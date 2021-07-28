package org.svrlab.thread;

import org.svrlab.thread.threads.NameThread;

public class ToExtendThread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new NameThread("Thread test [1] ");
        thread.start();
        Thread thread2 = new NameThread("Thread test [2] ");
        thread2.start();

        NameThread thread3 = new NameThread("Thread test [3] ");
        thread3.start();
        System.out.println( thread.getState() );

    }
}

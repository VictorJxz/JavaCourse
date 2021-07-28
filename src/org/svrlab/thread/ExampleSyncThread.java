package org.svrlab.thread;

import org.svrlab.thread.runnable.PrintPhrase;

public class ExampleSyncThread {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new PrintPhrase("Thread [0]", " Hello World ")).start();
        new Thread(new PrintPhrase("Thread [1]", " How are you")).start();

        Thread.sleep(100);
        Thread thread3 = new Thread(new PrintPhrase("Thread [2]", " See you soon"));
        thread3.start();
        Thread.sleep(100);
        System.out.println( thread3.getState() );
    }

    public synchronized static void printPhrase(String phrase1, String phrase2){
        System.out.print(phrase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( phrase2);
    }
}

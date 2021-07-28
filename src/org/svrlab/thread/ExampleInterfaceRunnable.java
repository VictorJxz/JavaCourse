package org.svrlab.thread;

import org.svrlab.thread.runnable.TravelHomework;

public class ExampleInterfaceRunnable {

    public static void main(String[] args) {

        new Thread( new TravelHomework("Vancouver Canada")).start();
        new Thread( new TravelHomework("Toronto Canada")).start();
        new Thread( new TravelHomework("Quebec Canada")).start();
    }
}

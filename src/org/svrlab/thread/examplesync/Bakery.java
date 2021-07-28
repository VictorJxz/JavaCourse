package org.svrlab.thread.examplesync;

public class Bakery {

    private String bread;
    private boolean available;

    public synchronized void make(String mass){
        while ( available ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.bread = mass;
        System.out.println("Making "+ this.bread);
        this.available = true;
        notify();
    }

    public synchronized  String consume(){
        while ( !available ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consume "+this.bread);
        this.available = false;
        notify();
        return bread;
    }

}

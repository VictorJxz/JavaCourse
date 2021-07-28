package org.svrlab.thread.runnable;

public class TravelHomework  implements Runnable{

    private String name;

    public TravelHomework(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for(int i =0; i < 10; i++){
            System.out.println( i+" -> "+ this.name);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Travel to "+ this.name);
    }
}

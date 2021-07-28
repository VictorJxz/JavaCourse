package org.svrlab.thread.threads;

public class NameThread extends Thread {


    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Start the thread run method "+ getName());
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(10);
                System.out.println( this.getName() +" -> "+i );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finish the thread");
    }
}

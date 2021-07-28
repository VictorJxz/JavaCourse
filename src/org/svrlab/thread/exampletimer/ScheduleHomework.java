package org.svrlab.thread.exampletimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleHomework {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task performed in "+ new Date() +" Thread : "+ Thread.currentThread().getName());
                System.out.println("Time is up");
                timer.cancel();
            }
        }, 5000);

        System.out.println("Schedule a task for 5 more seconds ...");
    }
}

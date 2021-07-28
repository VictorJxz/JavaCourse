package org.svrlab.thread.exampletimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduleHomeworkPeriod {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger counterAtomic = new AtomicInteger(3);
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int number = counterAtomic.getAndDecrement();
                if ( number > 0){
                    toolkit.beep();
                    System.out.println("Periodic task #"+number+" "+ new Date() +" Thread: "+ Thread.currentThread().getName());
                } else {
                    System.out.println("Time is up");
                    timer.cancel();
                }
            }
        }, 5000, 10000);

        System.out.println("Schedule a task for 10 more seconds ...");
    }
}

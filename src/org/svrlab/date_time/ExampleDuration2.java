package org.svrlab.date_time;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class ExampleDuration2 {

    public static void main(String[] args) {

        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep( 3 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant i2 = Instant.now();
        Duration time = Duration.between( i1, i2 );
        System.out.println("Time -> " + time);


    }
}

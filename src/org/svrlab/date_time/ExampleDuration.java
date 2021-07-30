package org.svrlab.date_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExampleDuration {

    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().plusHours( 3 ).plusMinutes( 20 ).plusDays( 1 );
        Duration slip = Duration.between( date1, date2);
        System.out.println("Slip -> " + slip);
        System.out.println( slip.getSeconds() );
        System.out.println( slip.toHours() );
    }
}

package org.svrlab.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("localDate = " + localDate);

        ZoneId vancouver = ZoneId.of("America/Vancouver");
        ZonedDateTime zoneVancouver = ZonedDateTime.of( localDate, vancouver );

        System.out.println("Departure time Vancouver -> " + zoneVancouver);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zoneMadrid = zoneVancouver.withZoneSameInstant( madrid ).plusHours(8);

        System.out.println("Arrival time Madrid -> " + zoneMadrid);


    }
}

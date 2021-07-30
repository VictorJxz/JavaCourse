package org.svrlab.date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ExampleZonedDateTime {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm") );
        System.out.println("localDate = " + localDate);

        //ZoneId vancouver = ZoneId.of("America/Vancouver");
        //ZonedDateTime zoneVancouver = ZonedDateTime.of( localDate, ZoneOffset.of("-07:00"));
        ZonedDateTime zoneVancouver = localDate.atZone( ZoneOffset.of("-07:00") );

        System.out.println("Departure time Vancouver -> " + zoneVancouver);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zoneMadrid = zoneVancouver.withZoneSameInstant( ZoneOffset.of("+02:00") ).plusHours(8);

        System.out.println("Arrival time Madrid -> " + zoneMadrid);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Details of the trip to spain: ");
        System.out.println("Departure Vancouver: " + formatter.format( zoneVancouver ) );
        System.out.println("Arrival time spain: " + formatter.format( zoneMadrid ));

        //ZoneId.getAvailableZoneIds().forEach( System.out::println );


    }
}

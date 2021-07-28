package org.svrlab.date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExampleLocalTime {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println( now );
        System.out.println("Hour: "+now.getHour());
        System.out.println("Minutes: "+now.getMinute());
        System.out.println("Seconds: "+now.getSecond());

        LocalTime hour = LocalTime.of(6, 30, 39);
        System.out.println( hour);
        hour = LocalTime.parse("06:30");

        System.out.println("Hour parse "+hour);
        LocalTime hour2 = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
        System.out.println("Hour 2 "+hour2);
        boolean isBefore = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println("isBefore = " + isBefore);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formatNow = now.format( df );
        System.out.println("formatNow = " + formatNow);

        formatNow = df.format( now );
        System.out.println("formatNow  df.format( now ) -> " + formatNow);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

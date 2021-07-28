package org.svrlab.date_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ExampleLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime -> " + dateTime);

        dateTime = LocalDateTime.of(2021, Month.JULY, 21, 15, 21, 10);
        System.out.println("dateTime LocalDateTime.of() ->  " + dateTime);

        dateTime = LocalDateTime.parse("2021-07-25T15:21:10");
        System.out.println("dateTime LocalDateTime.parse() ->  " + dateTime);

        LocalDateTime dateTime2 = dateTime.plusDays(1).plusHours(2);
        System.out.println("dateTime dateTime.plusDays(1) -> " + dateTime2);
        System.out.println("dateTime = " + dateTime);
        System.out.println("dateTime3 = " + dateTime.minusHours(5));
        System.out.println("dateTime = " + dateTime);

        Month month  = dateTime.getMonth();
        System.out.println("month -> " + month);

        int day = dateTime.getDayOfMonth();
        System.out.println("day -> " + day);

        int year = dateTime.getYear();
        System.out.println("year -> " + year);

        String format = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println("format -> " + format);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String format2 = dateTime.format( df );
        System.out.println("format2 -> " + format2);

        String format3 = df.format( dateTime );
        System.out.println("format3 -> " + format3);

    }
}

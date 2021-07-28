package org.svrlab.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ExampleLocalDate {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("localDate = " + currentDate);
        System.out.println("Day : " + currentDate.getDayOfMonth());

        Month month = currentDate.getMonth();
        System.out.println("Month " + month);
        System.out.println("Month number " + month.getValue());
        System.out.println("Month display name "+ month.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Day number "+dayOfWeek.getValue());
        System.out.println("Day display name " + dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("es","ES")));


        System.out.println("Month day : " + currentDate.getDayOfMonth());
        System.out.println("Years " + currentDate.getYear());
        System.out.println("Era : " + currentDate.getEra());
        System.out.println("Day of year : " + currentDate.getDayOfYear());

        currentDate = LocalDate.of(2020,1,25);
        System.out.println("currentDate = " + currentDate);

        currentDate = LocalDate.of( 2020, Month.NOVEMBER, 11);
        System.out.println("currentDate = " + currentDate);

        currentDate = LocalDate.parse("2020-02-01");
        System.out.println("currentDate = " + currentDate);

        LocalDate tomorrowDay = LocalDate.now().plusDays(1);
        System.out.println("tomorrowDay = " + tomorrowDay);

        LocalDate previousMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS );
        System.out.println("previousMonth = " + previousMonth);

        DayOfWeek wednesday = LocalDate.parse("2021-06-30").getDayOfWeek();
        System.out.println("wednesday = " + wednesday);

        int once = LocalDate.of(2021, 6, 29).getDayOfMonth();
        System.out.println("once = " + once);

        boolean isLeapYear = LocalDate.now().isLeapYear();
        System.out.println("isLeapYear = " + isLeapYear);

        boolean isBefore = LocalDate.of( 2020, 6, 30).isBefore(LocalDate.parse("2021-06-29"));
        System.out.println("isBefore = " + isBefore);

        boolean isAfter = LocalDate.parse("2021-06-30").isAfter(LocalDate.parse("2021-06-29"));
        System.out.println("isAfter = " + isAfter);

        isAfter = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("isAfter = " + isAfter);
    }
}

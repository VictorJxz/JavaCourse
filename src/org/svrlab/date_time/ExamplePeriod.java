package org.svrlab.date_time;

import java.time.LocalDate;
import java.time.Period;

public class ExamplePeriod {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2011, 9, 23);
        LocalDate  date2 = LocalDate.of( 2020, 11, 25);
        date2 = date2.withMonth( 12 );

        Period period = Period.between( date1, date2 );
        System.out.println("Period -> " + period);
        System.out.printf("Period between %s y %s there is %d years %d month %d day",
                date1, date2, period.getYears(), period.getMonths(), period.getDays() );



    }
}

package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleDate {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date = " + date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "EEEE, dd 'de' MMMM 'de' yyyy");
        String dateStr = simpleDateFormat.format( date );
        System.out.println("dateStr = " + dateStr);

        // getTime Format unix
        long j = 0;
        for ( int i = 0; i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);
        Date date2 = new Date();
        long realTime = date2.getTime() - date.getTime();
        System.out.println("Time elapsed by in the fro  = " + realTime);
    }
}

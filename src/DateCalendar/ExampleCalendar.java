package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        // calendar.set(2020, Calendar.SEPTEMBER, 03, 0,0,0);

        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        //calendar.set(Calendar.HOUR_OF_DAY, 21 );
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date date = calendar.getTime();
        System.out.println("date = " + date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss:SSS a");
        String dateFormat = simpleDateFormat.format( date );
        System.out.println("dateFormat = " + dateFormat);

        Calendar calendar1 = Calendar.getInstance();
        Date date1 = calendar1.getTime();

        if( date.after(date1) ){
            System.out.println("User date is after date1");
        } else if ( date.before( date1 ) ){
            System.out.println("User date is before date1");
        } else if ( date.equals( date1 )){
            System.out.println("User date is equals date1");
        }

        if ( date.compareTo( date1 ) > 0){
            System.out.println("User date is after date1");
        } else if ( date.compareTo( date1 ) < 0){
            System.out.println("User date is before date1");
        } else if ( date.compareTo( date1 ) == 0){
            System.out.println("User date is equals date1");
        }

    }
}

package DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleDateParse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("#............   Enter date   ............");
        try {
            Date date = simpleDateFormat.parse( scanner.next() );
            System.out.println("date = " + date);
            System.out.println("simpleDateFormat.format(date) = " + simpleDateFormat.format(date));

            Date date1 = new Date();
            System.out.println("date1 = " + date1);
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
        } catch (ParseException e) {
            // e.printStackTrace();
            System.err.println("Incorrect format -> "+e);
            System.err.println("Format -> 'dd-MM-yyyy'");
            //System.exit(1);
            main(args);
        }
    }
}

package Arrays;

import java.util.Scanner;

public class ExampleSearchString {

    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner scanner = new Scanner( System.in );
        for ( int i = 0; i < a.length; i++){
            System.out.print("Enter username: ");
            a[i] = scanner.next();
        }

        System.out.println("\r\nEnter the username to search : ");
        String username = scanner.next();
        int i = 0;
        for( ;i < a.length && !a[i].equalsIgnoreCase( username) ; i++){ }

        if( i == a.length){
            System.out.println("Number not found ");
        } else if(a[i].toLowerCase().compareTo( username.toLowerCase() ) == 0) {
            System.out.println("Found in position -> "+i);
        }


    }
}

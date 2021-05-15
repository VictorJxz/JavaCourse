package Arrays;

import java.util.Scanner;

public class ExampleDetectOrder {

    public static void main(String[] args) {

        int[] a = new int[7];
        int longA = a.length;

        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter 7 numbers ");

        for (int i = 0; i < longA; i++){
            a[i] = scanner.nextInt();
        }

        boolean ascending = false;
        boolean descending = false;

        for ( int i = 0; i < longA - 1; i++){
            if ( a[i] > a[ i + 1] ){
                descending = true;
            }
            if ( a[i] < a[ i + 1] ){
                ascending = true;
            }
        }

        if ( descending == true && ascending == true){
            System.out.println("Messy array ");
        }
        if ( descending == false && ascending == false ){
            System.out.println("They are all the same ");
        }
        if ( descending == false && ascending == true ){
            System.out.println("The array is ascending ");
        }
        if ( descending == true && ascending == false ){
            System.out.println("The array is descending ");
        }
    }
}

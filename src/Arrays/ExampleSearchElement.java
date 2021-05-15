package Arrays;

import java.util.Scanner;

public class ExampleSearchElement {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner( System.in );
        for ( int i = 0; i < a.length; i++){
            System.out.print("Enter number : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\nEnter the number to search : ");
        int number = scanner.nextInt();
        int i = 0;
        for( ;i < a.length && a[i] != number; i++){ }

        if( i == a.length){
            System.out.println("Number not found ");
        } else if(a[i] == number) {
            System.out.println("Found in position -> "+i);
        }


    }
}

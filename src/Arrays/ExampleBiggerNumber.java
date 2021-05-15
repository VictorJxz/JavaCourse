package Arrays;

import java.util.Scanner;

public class ExampleBiggerNumber {

    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner scanner = new Scanner( System.in );
        int longA = a.length;

        System.out.println("#...........    Enter #5 numbers   .............");
        for ( int i = 0; i < longA; i++ ){
            a[ i ] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 1; i < longA; i++){
            max = ( a[ max ] > a[i])? max: i;
            System.out.println("max = " + max);
            System.out.println("i = " + i);
        }
        System.out.println("max = " + a[max]);
    }
}

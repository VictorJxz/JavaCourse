package Arrays;

import java.util.Scanner;

public class ExampleRemoveItem {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.print("Enter number : ");
            a[i] = scanner.nextInt();
        }
        System.out.println("#.....      Position to delete [0 - 9]      ....");
        int position = scanner.nextInt();

        for ( int i = position; i < a.length -1; i++ ){
            a[i] = a[i+1];
        }

        int[] b = new int[a.length -1];
        System.arraycopy( a, 0, b, 0, b.length );

        for ( int i = 0; i < b.length; i++){
            System.out.println("# "+i+" -> "+b[i]);
        }


    }
}

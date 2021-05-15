package Arrays;


import java.util.Scanner;

public class ExampleInsertItemIII {

    public static void main(String[] args) {

        int[] a = new int[5];
        int number, position, latest;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length ; i++){
            System.out.print("Enter number : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to insert ");
        number = scanner.nextInt();

        latest = a[ a.length -1];
        position = 0;
        while (position < 5 && number > a[position]){
            position++;
        }

        for ( int i = a.length -2; i >= position; i-- ){
            a[i+1] = a[i];
        }

        int[] b = new int[ a.length + 1];
        System.arraycopy( a, 0, b, 0, a.length);

        if ( number > latest ){
            b[ b.length - 1] = number;
        } else {
            b[ b.length - 1] = latest;
            b[ position ] = number;
        }

        System.out.println("Neat array ");
        for (int i = 0; i < b.length; i++){
            System.out.println("# "+i+" -> "+b[i]);
        }

    }
}

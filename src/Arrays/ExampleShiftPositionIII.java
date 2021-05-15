package Arrays;


import java.util.Scanner;

public class ExampleShiftPositionIII {

    public static void main(String[] args) {

        int[] a = new int[7];
        int number, position;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length -1; i++){
            System.out.print("Enter number : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to insert ");
        number = scanner.nextInt();

        position = 0;
        while (position < 6 && number > a[position]){
            position++;
        }

        for ( int i = a.length -2; i >= position; i-- ){
            a[i+1] = a[i];
        }

        a[ position ] = number;
        System.out.println("Neat array ");
        for (int i = 0; i < a.length; i++){
            System.out.println("# -> "+a[i]);
        }

    }
}

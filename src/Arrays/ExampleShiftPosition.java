package Arrays;

import java.util.Scanner;

public class ExampleShiftPosition {

    public static void main(String[] args) {

        int[] a = new int[10];
        int latest;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.print("Enter number : ");
            a[i] = scanner.nextInt();
        }

        latest = a[ a.length - 1 ];
        for (int i =   a.length -2; i>= 0; i--){
            a[ i +1] = a[i];
        }
        a[0] = latest;

        System.out.println("#........   Final array   ............");
        for (int i = 0; i < a.length; i++){
            System.out.println(" # -> "+a[i]);
        }
    }
}

package Arrays;

import java.util.Scanner;

public class ExampleShiftPositionII {

    public static void main(String[] args) {

        int[] a = new int[10];
        int item, position;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length -1; i++){
            System.out.print("Enter item : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("#........   New item  ................");
        item = scanner.nextInt();
        System.out.println("#........  Position to add   [ 0 - 9 ].........");
        position = scanner.nextInt();

        for (int i =   a.length -2; i>= position; i--){
            a[ i +1] = a[i];
        }
        a[position] = item;

        System.out.println("#........   Final array   ............");
        for (int i = 0; i < a.length; i++){
            System.out.println(" # -> "+a[i]);
        }
    }
}

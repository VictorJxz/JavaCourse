package Arrays;

import java.util.Scanner;

public class ExampleInsertItem {

    public static void main(String[] args) {

        int[] a = new int[10];
        int item, position, latest;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length ; i++){
            System.out.print("Enter item : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("#........   New item  ................");
        item = scanner.nextInt();
        System.out.println("#........  Position to add   [ 0 - 9 ].........");
        position = scanner.nextInt();

        latest = a[ a.length -1];
        for (int i =   a.length -2; i>= position; i--){
            a[ i +1] = a[i];
        }

        int[] b = new int[ a.length +1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[position] = item;

        b[ b.length -1] = latest;
        System.out.println("#........   Final array   ............");
        for (int i = 0; i < b.length; i++){
            System.out.println(" # "+i+" -> "+b[i]);
        }
    }
}

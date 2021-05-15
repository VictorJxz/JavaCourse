package Arrays;

import java.util.Scanner;

public class ExampleOddEven {

    public static void main(String[] args) {

        int[] a, odd, even;
        a = new int[10];
        int totalEven = 0, totalOdd = 0;
        int longA = a.length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("#.............  Enter 10 number  .............");
        for (int i = 0; i < longA; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < longA; i++){
            if ( a[i] % 2 == 0 ){
                totalEven++;
            } else {
                totalOdd++;
            }
        }
        even = new int[totalEven];
        odd = new int[totalOdd];

        int j = 0,k = 0;
        for ( int i = 0; i < longA; i++){
            if ( a[i] % 2 == 0){
                even[j++] = a[i];
            } else {
                odd[k++] = a[i];
            }
        }

        System.out.println("#............    Even   ...........");
        for ( int i = 0; i < even.length; i++){
            System.out.println("# -> "+even[i]);
        }
        System.out.println("#............    Odd   ...........");
        for ( int i = 0; i < odd.length; i++){
            System.out.println("# -> "+odd[i]);
        }
    }
}

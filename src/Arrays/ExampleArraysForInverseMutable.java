package Arrays;

import java.util.Arrays;

public class ExampleArraysForInverseMutable {

    public static void arrayInverse(String[] array ){

        int longArray = array.length;
        int longArray2 = array.length;
        for ( int i = 0; i < longArray2; i++){
            String currently = array[i];
            String inverse = array[ longArray-1-i ];
            array[i] = inverse;
            array[ longArray-1-i ] = currently;
            longArray2--;
        }
    }

    public static void main(String[] args) {

        String[] products = {"Kingston","ATest1","CTest2","RTest3","DTest4","QTest5","PTest6","ZTest7"};
        int longArray = products.length;

        Arrays.sort( products );
        //arrayInverse( products );
        //Collections.reverse( Arrays.asList( products ));

        System.out.println("# .........    Using for   ...............");
        for ( int i = 0; i < longArray; i++){
            System.out.println("# " +i+" -> "+ products[ i ]);
        }
    }
}

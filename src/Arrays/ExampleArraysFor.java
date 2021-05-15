package Arrays;

public class ExampleArraysFor {

    public static void main(String[] args) {

        String[] products = new String[7];
        int longArray = products.length;

        products[0] = "Kingston";
        products[1] = "ATest1";
        products[2] = "CTest2";
        products[3] = "RTest3";
        products[4] = "DTest4";
        products[5] = "QTest5";
        products[6] = "PTest6";

        // The for is more optimized
        System.out.println("#.................   For          ............");
        for ( int i = 0; i < longArray; i++){
            System.out.println("product " +i +" : "+ products[i]);
        }
        System.out.println("#.................   Foreach       ............");
        for ( String item: products ){
            System.out.println("item = " + item);
        }
        System.out.println("#.................   While       ............");
        int i = 0;
        while ( i < longArray  ){
            System.out.println("item = " + products[i]);
            i++;
        }
        System.out.println("#.................  Do while       ............");
        int j = 0;
        do {
            System.out.println("item = " + products[j]);
            j++;
        } while ( j < longArray );

        int[] numbers = new int[4];
        int longNumber = numbers.length;
        for (int k = 0; k < longNumber; k++){
            numbers[k] = k * 3;
        }

        for (int k = 0; k < longNumber; k++){
            System.out.println("numbers[ k ] -> " + numbers[ k ]);
        }

    }
}

package Arrays;


import java.util.Arrays;

public class ExampleArrays {

    public static void main(String[] args) {

        String[] products = new String[7];
        products[0] = "Kingston";
        products[1] = "ATest1";
        products[2] = "CTest2";
        products[3] = "RTest3";
        products[4] = "DTest4";
        products[5] = "QTest5";
        products[6] = "PTest6";

        Arrays.sort( products );

        String prod1 = products[0];
        String prod2 = products[1];
        String prod3 = products[2];
        String prod4 = products[3];

        int[] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = Integer.valueOf("7");
        numbers[2] = (int) 3L;
        numbers[3] = 4;
        Arrays.sort( numbers );

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[ numbers.length -1 ];

        System.out.println("products[0] = " + prod1);
        System.out.println("products[1] = " + prod2);
        System.out.println("products[2] = " + prod3);
        System.out.println("products[3] = " + prod4);
        System.out.println("products[4] = " + products[4]);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}

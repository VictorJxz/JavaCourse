package Arrays;

public class ExampleArraysForInverse {

    public static void main(String[] args) {

        String[] products = {"Kingston","ATest1","CTest2","RTest3","DTest4","QTest5","PTest6"};
        int longArray = products.length;

        // The for is more optimized
        System.out.println("#.................   For          ............");
        for ( int i = 0; i < longArray; i++){
            System.out.println("product " +i +" : "+ products[i]);
        }

        System.out.println("#.................   For inverse     ............");
        for ( int i = 0; i < longArray; i++ ){
            System.out.println("# "+( longArray-1-i  )+" -> "+products[ longArray-1-i ]);
        }

        System.out.println("#..............  For inverse 2  ...............");
        for (int i = longArray - 1; i >= 0; i--){
            System.out.println("# "+i+" -> "+ products[ i ]);
        }

    }
}

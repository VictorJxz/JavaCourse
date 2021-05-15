package Arrays;

public class BubbleAlgorithm {

    public static void bubbleSort( Object[] array ){

        int longArray = array.length;
        int counter = 0;

        for ( int i = 0; i < longArray; i++){
            for ( int j = 0; j < longArray -1 -i; j++){
                if ( ( ( Comparable ) array[j+1]).compareTo( array[j] ) > 0 ){
                    Object aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) {

        String[] products = {"Kingston","ATest1","CTest2","RTest3","DTest4","QTest5","PTest6","ZTest7"};
        int longArray = products.length;

        bubbleSort( products );
        System.out.println("# .........    Sort bubble -> String   ...............");
        for ( int i = 0; i < longArray; i++){
            System.out.println("# " +i+" -> "+ products[ i ]);
        }

        Integer[] numbers = new Integer[4];
        int longNumber = numbers.length;

        numbers[0] = 10;
        numbers[1] = Integer.valueOf("7");
        numbers[2] = (int) 3L;
        numbers[3] = 4;

        bubbleSort( numbers );
        System.out.println("# .........    Sort bubble -> Integer  ...............");
        for ( int i = 0; i < longNumber; i++){
            System.out.println("# "+i+" -> " + numbers[i]);
        }
    }
}

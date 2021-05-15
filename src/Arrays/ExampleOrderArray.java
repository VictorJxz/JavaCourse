package Arrays;

public class ExampleOrderArray {

    public static void main(String[] args) {

        int[] numbers = new  int[10];
        int[] a = new int[10];
        int aux = 0;
        int longArray = numbers.length;

        for ( int i = 0; i < longArray; i++) {
            numbers[ i ] = i + 1;
        }

        for ( int i = 0; i < longArray -i; i++ ){
            a[ aux++ ] = numbers[ i ];
            a[ aux++ ] = numbers[ longArray -1 -i];
           // System.out.println("# -> " + numbers[i]+ " : " +numbers[ longArray -1 -i ]);
        }

        for (int i = 0; i < longArray; i++){
            System.out.println("# "+i+" -> " + a[i]);
        }
    }
}

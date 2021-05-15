package Arrays;

public class ExampleCombinedArray {

    public static void main(String[] args) {

        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        int longA = a.length;
        int longB = b.length;
        int longC = c.length;

        for (int i = 0; i < longA; i++){
            a[i] = i+1;
        }

        for (int i = 0; i < longB; i++){
            b[i] = (i+1)*5;
        }

        int aux = 0;
        for (int i = 0; i < 10; i+=2){

            for ( int j = 0; j < 2; j++){
                c[ aux++ ] = a[i+j];
            }
            for ( int j = 0; j < 2; j++){
                c[ aux++ ] = b[i+j];
            }
        }

        for ( int i = 0; i < longC; i++){
            System.out.println("# " +i+" -> "+ c[i]);
        }
    }
}

package Matrices;

public class ExampleSearchItem {

    public static void main(String[] args) {

        int[][] matricesInteger =  {
                {30, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int searchElement = 32768;
        boolean found = false;

        int i , j = 0;

        search: for (i = 0; i < matricesInteger.length; i++){
            for ( j = 0; j < matricesInteger[i].length; j++){
                if ( matricesInteger[i][j] == searchElement ){
                    found = true;
                    break search;
                }
            }
        }

        if ( found ){
            System.out.println("Found : "+searchElement+" in the coordinates -> "+i+" , "+j);
        } else {
            System.out.println("Data not found in matrix -> "+searchElement);
        }

    }
}

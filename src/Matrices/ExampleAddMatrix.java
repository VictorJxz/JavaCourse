package Matrices;

public class ExampleAddMatrix {

    public static void main(String[] args) {

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] b = {
                {10,20,30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int[][] add = new int[3][3];
        for (int i = 0; i < a.length; i++){
            for ( int j = 0; j < a[i].length; j++){
                add[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < add.length; i++){
            for ( int j = 0; j < add[i].length; j++){
                System.out.print( add[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

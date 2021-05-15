package Matrices;

public class ExampleSymmetricMatrix {

    public static void main(String[] args) {

        boolean symmetric = true;
        int[][] matrix = {
            {1, 2, 3, 4},
            {2, 1, 0, 5},
            {3, 0, 1, 6},
            {4, 5, 6, 7}
        };

        exit: for ( int i = 0; i < matrix.length; i++ ){
            for ( int j = 0; j < i; j++) {
                if ( matrix[i][j] != matrix[j][i] ){
                    symmetric = false;
                    break exit;
                }
            }
        }

        if ( symmetric ){
            System.out.println("The matrix is symmetric");
        } else {
            System.out.println("The matrix not is symmetric ");
        }
    }
}

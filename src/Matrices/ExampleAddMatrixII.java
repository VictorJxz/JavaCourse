package Matrices;

public class ExampleAddMatrixII {

    public static void main(String[] args) {

        int addRow = 0, addColumn = 0;
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++ ){
                addRow += a[i][j];
                addColumn += a[j][i];
            }
            System.out.println("#.........................................");
            System.out.println("Total row : "+i+" -> "+addRow);
            System.out.println("Total column : "+i+" -> "+addColumn);
        }


    }
}

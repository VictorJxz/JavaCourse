package Matrices;

public class ExampleMatricesStringII {

    public static void main(String[] args) {

        String[][] usernames = {{"Test1", "Test2"},{"Test3", "Test4" },{"Test5", "Test6"}};

        System.out.println("#......     Iterating with foreach      ........");
        for (String[] row: usernames){
            for ( String username: row ){
                System.out.print(username + "\t");
            }
            System.out.println();
        }
    }
}

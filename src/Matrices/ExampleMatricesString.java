package Matrices;

public class ExampleMatricesString {

    public static void main(String[] args) {

        String[][] usernames = new String[3][2];

        usernames[0][0] = "Test1";
        usernames[0][1] = "Test2";

        usernames[1][0] = "Test3";
        usernames[1][1] = "Test4";

        usernames[2][0] = "Test5";
        usernames[2][0] = "Test6";

        for (String[] strings : usernames) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j]+" \t ");
            }
            System.out.println();
        }
        System.out.println("#......     Iterating with foreach      ........");
        for (String[] row: usernames){
            for ( String username: row ){
                System.out.print(username + "\t");
            }
            System.out.println();
        }
    }
}

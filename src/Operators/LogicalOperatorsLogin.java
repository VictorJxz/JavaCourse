package Operators;

import java.util.Scanner;

public class LogicalOperatorsLogin {

    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "Vicktor";
        usernames[1] = "Admin";

        passwords[0] = "qubit01";
        passwords[1] = "test01";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name ");
        String user = scanner.next();
        System.out.println("Enter the password");
        String psw = scanner.next();

        boolean verify = false;

        for (int i = 0; i < usernames.length; i++){
            if( usernames[i].equals(user) && passwords[i].equals(psw)){
                verify = true;
                break;
            }
        }
        String message = verify ? "Access granted "+user : "Verify the data ! \nAccess denied ...";
        System.out.println( message);

/*        if( verify ){
            System.out.println("Access granted "+user);
        } else {
            System.out.println("Verify the data !");
            System.out.println("Access denied ...");
        }*/
    }
}

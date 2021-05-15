package ControlStructures;

import java.util.Scanner;

public class SentenceSwichCase {

    public static void main(String[] args) {

        int num = 3, month = 0;
        String namemonth = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month");
        month = scanner.nextInt();

        switch( month ){
            case 1:
                namemonth = "January";
                break;
            case 2:
                namemonth = "February";
                break;
            case 3:
                namemonth = "March";
                break;
            case 4:
                namemonth = "April";
                break;
            case 5:
                namemonth = "May";
                break;
            case 6:
                namemonth = "June";
                break;
            case 7:
                namemonth = "July";
                break;
            case 8:
                namemonth = "August";
                break;
            case 9:
                namemonth = "September";
                break;
            case 10:
                namemonth = "October";
                break;
            case 11:
                namemonth = "November";
                break;
            case 12:
                namemonth = "December";
            default:
                namemonth = "Undefined";
                break;
        }
        System.out.println("namemonth = " + namemonth);

        switch( num ){
            case 0:
                System.out.println("The number is zero");
                break;
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;
            default:
                System.out.println("Unknown number or character");
        }

        String role = "ROLE_ADMIN";
        switch( role ){
            case "ROLE_ADMIN":
                System.out.println("Hi Admin, welcome ");
                break;
            case "ROLE_USER":
                System.out.println("Hi user welcome");
                break;
            default:
                System.out.println("ACCESS DENIED");
        }

    }
}

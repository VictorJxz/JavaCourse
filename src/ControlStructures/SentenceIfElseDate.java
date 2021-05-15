package ControlStructures;

import java.util.Scanner;

public class SentenceIfElseDate {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int month = 0, day = 0, year = 0;

        System.out.println("Enter the month");
        month = scanner.nextInt();
        System.out.println("Enter the year ");
        year = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
        } else  if ( month == 4 || month == 6 || month == 9 || month == 11 ){
            day = 30;
        } else if ( month == 2 ){
            if ( year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0)) ){
                day = 29;
            } else {
                day = 28;
            }
        }

        System.out.println("day = " + day);

    }

}

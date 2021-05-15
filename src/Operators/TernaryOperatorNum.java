package Operators;

import java.util.Scanner;

public class TernaryOperatorNum {

    public static void main(String args[]){

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number ");
        int num2 = scanner.nextInt();
        
        max = (num1 > num2)? num1 : num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("May number is = " + max);






    }
}

package Operators;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {


        String varts = 7 == 5 ? "Is true": "Is false";
        System.out.println("varts = " + varts);

        String status = "";
        double qualification = 6.2;

        double mathematics = 0.0;
        double science = 0.0;
        double history = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Math grade");
        mathematics = scanner.nextDouble();
        System.out.println("Science grade");
        science = scanner.nextDouble();
        System.out.println("History grade");
        history = scanner.nextDouble();

        qualification = (mathematics + science + history) / 3;

        System.out.println("qualification = " + qualification);
        status = qualification >= 5.9 ? "Approved ...":"Rejected";
        System.out.println("status = " + status);



    }
}

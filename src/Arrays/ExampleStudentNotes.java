package Arrays;

import java.util.Scanner;

public class ExampleStudentNotes {

    public static void main(String[] args) {

        double[] mathClass, historyClass, languageClass ;
        double sumMath = 0, sumHistory = 0, sumLanguage = 0;
        mathClass = new double[7];
        historyClass = new double[7];
        languageClass = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("#.......... Enter 7 grades for math students .....");
        for ( int i = 0; i < mathClass.length; i++){
            mathClass[i] = scanner.nextDouble();
        }

        System.out.println("#....... Enter 7 grades for math students .....");
        for ( int i = 0; i < historyClass.length; i++){
            historyClass[i] = scanner.nextDouble();
        }

        System.out.println("#....... Enter 7 grades for language students .....");
        for ( int i  = 0; i < languageClass.length; i++){
            languageClass[i] = scanner.nextDouble();
        }

        for ( int i = 0; i < 7; i++){
            sumMath +=  mathClass[i];
            sumHistory += historyClass[i];
            sumLanguage += languageClass[i];
        }

        double averageMath = sumMath/mathClass.length;
        double averageHistory = sumHistory/historyClass.length;
        double averageLanguage = sumLanguage/ languageClass.length;

        System.out.println("#..   Math class average : "+ averageMath);
        System.out.println("#..   History class average : "+averageHistory);
        System.out.println("#..   Language class average : "+averageLanguage);
        System.out.println("#.. Total course average : "+( averageMath + averageHistory +  averageLanguage ) / 3);

        System.out.println("Enter student ID : (0 - 6) ");
        int id = scanner.nextInt();
        double  averageStudent = ( mathClass[id] + historyClass[id] + historyClass[id]) / 3;
        System.out.println("Average student ID : "+id+" -> "+ averageStudent );
    }
}

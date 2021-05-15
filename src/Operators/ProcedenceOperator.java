package Operators;

public class ProcedenceOperator {
    public static void main(String[] args) {
        int i = 14, j = 8, k = 20;

        double qualification = (i +j + k) / 3d;
        System.out.println("qualification = " + qualification);

        qualification = (i +j +k) / 3d * 10; // 42 / 3 = 14 * 10
        System.out.println("qualification = " + qualification);

        qualification = ++i + j-- +k / 3d * 10; // (15 + 8) 66,6
        System.out.println("qualification = " + qualification);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        





    }
}

package ValuesVsReference;

public class PassByValue {

    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("Method main i = " + i);
        test( i );
        System.out.println("i = " + i);
    }

    public static void test( Integer i ){
        System.out.println("Method test i = " + i);
        i = 35;
        System.out.println(" New value of i = "+i);
    }
}

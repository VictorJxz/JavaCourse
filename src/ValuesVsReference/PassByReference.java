package ValuesVsReference;

public class PassByReference {

    public static void main(String[] args) {
        Integer[] intArray = {10,11,12};
        System.out.println("********   Method Main   ************");
        System.out.println(" ....................................");
        for ( int i = 0; i < intArray.length; i++){
            System.out.println("intArray = " + intArray[i]);
        }
        test( intArray );
        System.out.println("*********   Method Main   ***********");
        System.out.println(" ....................................");
        for ( int i = 0; i < intArray.length; i++){
            System.out.println("intArray = " + intArray[i]);
        }

    }
    public static void test( Integer[] intArray ){
        System.out.println("*********   Method Test   ************");
        System.out.println(" ....................................");
        for ( int i = 0; i < intArray.length; i++){
            intArray[i] = intArray[i] + 20;
            System.out.println("intArray = " + intArray[i]);
        }
    }

}

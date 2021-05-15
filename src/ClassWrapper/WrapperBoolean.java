package ClassWrapper;

public class WrapperBoolean {

    public static void main(String[] args) {

        Integer num, num1;
        num = 11;
        num1 = 13;

        boolean primitive = num > num1;
        Boolean objBoolean = Boolean.valueOf( primitive );
        Boolean objBoolean2 = Boolean.valueOf( "false" );

        System.out.println("primitive = " + primitive);
        System.out.println("objectBoolean = " + objBoolean);
        System.out.println("objectBoolean2 = " + objBoolean2);

        System.out.println("Compare two boolean object "+ ( objBoolean == objBoolean2));
        System.out.println("Compare two boolean object "+ ( objBoolean.equals(objBoolean2) ));

    }
}

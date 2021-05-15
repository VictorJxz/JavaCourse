package ClassWrapper;

public class AutoBoxing {

    public static void main(String[] args) {

        Integer[] integers = { Integer.valueOf(19), 1, 2, 3, 4, 5, 6};
        int addition = 0;

        for( Integer item: integers ){
            if ( item.intValue() % 2 == 0 ){
                addition += item.intValue();
            }
        }
        System.out.println("addition = " + addition);
        addition = 0;

        // Autoboxing
        for( Integer item: integers ){
            if ( item % 2 == 0 ){
                addition += item;
            }
        }
        System.out.println("addition = " + addition);

    }
}

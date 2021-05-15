package HelloWorld;

public class ExampleStringValidate {

    public static void main(String[] args) {
        String course = null;
        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

        if ( isNull ){
            course = "Java programming"; // Java programming
        }
        boolean isNullt = course.length() == 0;
        System.out.println("isNullt = " + isNullt);

        boolean isNull2 = course.isEmpty();
        System.out.println("isNull2 = " + isNull2);

        boolean isItWhite = course.isBlank();
        System.out.println("isItWhite = " + isItWhite);

        if ( isItWhite == false){ // course.isEmpty() == false
            System.out.println("course = " + course.toUpperCase());
            System.out.println( "Welcome to the course ".concat(course));
        }


    }
}

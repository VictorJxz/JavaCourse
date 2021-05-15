package HelloWorld;

public class ExampleString {

    public static void main(String[] args){
        String course = "Programing java";
        String course2 = new String("programing java");

        boolean esIqualsx = course == course2;
        System.out.println("course == course2 = " + esIqualsx);

        esIqualsx = course.equalsIgnoreCase(course2);
        System.out.println("course.equalsIgnoreCase(course2) = " + esIqualsx);

        String course3 = "Programing java";
        esIqualsx = course.equals(course3);
        System.out.println("course.equals(course3) = " + esIqualsx);
    }
}

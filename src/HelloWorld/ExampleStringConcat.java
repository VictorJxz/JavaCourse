package HelloWorld;

public class ExampleStringConcat {
    public static void main(String[] args){

        String course = "Programing java";
        String teacher = "Andres Guzman";
        String detail = course +" with the instructor "+ teacher;
        System.out.println("detail = " + detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail +" "+ (numberB + numberA));
        System.out.println(numberA + numberB + " "+detail);

        String detail2 = course.concat(" ".concat(teacher));
        System.out.println("detail2 = " + detail2);
    }
}

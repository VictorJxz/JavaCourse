package HelloWorld;

public class ExampleStringImmutable {
    public static void main(String[] args){

        String course = "Programing java";
        String teacher = "Andres Guzman";

        String result = course.concat(teacher);
        System.out.println("course = "+ course);
        System.out.println("result = " + result);
        System.out.println( course == result);

        String result2 = course.transform( c -> {
            return c + " with the "+ teacher;
        });
        System.out.println("result2 = " + result2);
        System.out.println("course = " + course);

        String result3 = result.replace("a" ,"A");
        System.out.println("result = " + result3);
    }
}

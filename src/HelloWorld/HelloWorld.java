package HelloWorld;

public class HelloWorld {

    public static void main(String[] args){

        String greeting = "Hello World Java";
        System.out.println("greeting = "+ greeting.toUpperCase());

        int number = 11;
        int number2 = 5;

        boolean value = true;
        if( value ){
            number2 = 10;
            System.out.println("number = " + number);
        }
        System.out.println("number2 = " + number2);

        var number3 = "15";
        String name;
        name = "Test";

        if( number >10 ){
            name = "Virus";
        }
        System.out.println("Name = "+name);
    }
}

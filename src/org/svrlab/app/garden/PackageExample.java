package org.svrlab.app.garden;



import org.svrlab.app.home.Person;
import static org.svrlab.app.home.HairColor.*;
import static org.svrlab.app.home.Person.*;


public class PackageExample {

    public static void main(String[] args) {

        Person person = new Person();
        person.setUsername( "Victor" );
        person.setSurname( "TestSurname");
        person.setHairColor( BLACK );
        System.out.println( person.getUsername() );

        Dog dog = new Dog();
        dog.name = "Tobby";
        dog.breed = "Bulldog";

        String playing = dog.play( person );
        System.out.println("playing = " + playing);
        String greetings = greet();
        System.out.println("greetings = " + greetings);
        String womenGender = WOMAN_GENDER;
        String menGender = MEN_GENDER;
    }
}

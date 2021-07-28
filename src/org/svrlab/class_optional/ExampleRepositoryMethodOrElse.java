package org.svrlab.class_optional;

import org.svrlab.class_optional.models.Computer;
import org.svrlab.class_optional.repository.ComputerRepository;
import org.svrlab.class_optional.repository.Repository;

public class ExampleRepositoryMethodOrElse {

    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        //Computer defaultComp = new Computer("HP Omen", "LA0001");
        // orElse() Execute the method even if it is not required
        Computer pc = repository.filter("rog").orElse( defaultValue() );
        System.out.println( pc );

        pc = repository.filter("macbook pro").orElseGet( ExampleRepositoryMethodOrElse::defaultValue );
        System.out.println( pc );


    }

    public static Computer defaultValue(){
        System.out.println("Getting the default value...");
        return new Computer("HP Omen", "LA0001");
    }
}

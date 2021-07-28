package org.svrlab.class_optional;

import org.svrlab.class_optional.models.Computer;
import org.svrlab.class_optional.repository.ComputerRepository;
import org.svrlab.class_optional.repository.Repository;

import java.util.Optional;

public class ExampleRepository {

    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        repository.filter("asus").ifPresentOrElse( System.out::println,
                () -> System.out.println("It was not found") );

        //Optional<Computer> pc = repository.filter("asus rog");

/*        if ( pc.isPresent()){
            System.out.println( pc.get());
        } else {
            System.out.println("It was not found");
        }*/

    }
}

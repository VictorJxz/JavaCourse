package org.svrlab.class_optional;

import org.svrlab.class_optional.models.Computer;
import org.svrlab.class_optional.repository.ComputerRepository;
import org.svrlab.class_optional.repository.Repository;

import java.util.Optional;

public class ExampleRepositoryOrElseThrow {

    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        Computer pc = repository.filter("rog").orElseThrow( IllegalStateException::new );
        System.out.println( pc );

        String file = "document.pdf";
        String extension = Optional.ofNullable( file )
                .filter( a -> a.contains("."))
                .map(a -> a.substring( file.indexOf(".") + 1))
                .orElseThrow();
        System.out.println( extension );


    }
}

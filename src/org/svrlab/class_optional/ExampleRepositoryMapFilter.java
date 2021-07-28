package org.svrlab.class_optional;

import org.svrlab.class_optional.models.Computer;
import org.svrlab.class_optional.models.Maker;
import org.svrlab.class_optional.models.Processor;
import org.svrlab.class_optional.repository.ComputerRepository;
import org.svrlab.class_optional.repository.Repository;

public class ExampleRepositoryMapFilter {

    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();

        String maker = repository.filter("asus")
                .flatMap( Computer::getProcessor )
                .flatMap( Processor::getMaker )
                .filter( m -> "intel".equalsIgnoreCase( m.getName()))
                .map( Maker::getName )
                .orElse("Unknown maker");

        System.out.println( maker );



    }

}

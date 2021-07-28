package org.svrlab.class_optional.repository;

import org.svrlab.class_optional.models.Computer;
import org.svrlab.class_optional.models.Maker;
import org.svrlab.class_optional.models.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer>{

    private List<Computer> dataSource ;

    public ComputerRepository() {
        dataSource = new ArrayList<>();

        Processor proc = new Processor("I9-9800H", new Maker("Intel"));
        Computer asus = new Computer("Asus ROG", "Strix G512");
        asus.setProcessor( proc );

        dataSource.add( asus );
        dataSource.add( new Computer("MacBook Pro","MVVK2CI" ));
    }

    @Override
    public Optional<Computer> filter(String name) {
        return  dataSource.stream()
                .filter( c -> c.getName().toLowerCase().contains( name.toLowerCase() ))
                .findFirst();
/*        for ( Computer  c: dataSource){
            if ( c.getName().equalsIgnoreCase( name ) ){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}

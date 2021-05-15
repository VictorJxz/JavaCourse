package org.svrlab.repository_poo.repository.list;

import org.svrlab.repository_poo.model.Client;
import org.svrlab.repository_poo.repository.Direction;
import org.svrlab.repository_poo.repository.AbstractListRepository;
import org.svrlab.repository_poo.repository.exeception.ReadAccessDataException;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Client> {


    @Override
    public void edit(Client client) throws ReadAccessDataException {
        Client c = this.elementById( client.getId() );
        c.setUsername( client.getUsername() );
        c.setSurname( client.getSurname() );
    }

    @Override
    public List<Client> toList(String field, Direction dir) {
        List<Client> orderedList = new ArrayList<>(this.dataSource);
        orderedList.sort(( a,  b) -> {
                int result = 0;
                if ( dir == Direction.ASC){
                    result = order(field ,a, b);
                } else if ( dir == Direction.DESC ){
                    result = order(field, b, a);
                }
                return result;
        });
        return orderedList;
    }


    public static int order( String field, Client a, Client b){
        int result = 0;
        switch ( field) {
            case "id" ->
                    result = a.getId().compareTo( b.getId() );
            case "username" ->
                    result = a.getUsername().compareTo( b.getUsername());
            case  "surname" ->
                    result = a.getSurname().compareTo( b.getSurname());
        }
        return result;
    }

}

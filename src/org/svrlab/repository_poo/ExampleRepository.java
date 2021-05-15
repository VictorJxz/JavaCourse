package org.svrlab.repository_poo;

import org.svrlab.repository_poo.model.Client;
import org.svrlab.repository_poo.repository.*;
import org.svrlab.repository_poo.repository.exeception.*;
import org.svrlab.repository_poo.repository.list.ClientListRepository;

import java.util.List;

public class ExampleRepository {

    public static void main(String[] args) {

        try {
            IndexRepository<Client> rep = new ClientListRepository();
            rep.create(new Client("Saul", "Perez"));
            rep.create(new Client("Erick", "Gonzalez"));
            rep.create(new Client("Roberto", "Martinez"));
            Client vrs = new Client("Victor", "Jimenez");
            rep.create( vrs );
            rep.create( vrs);

            //rep.create(null);

            List<Client> clients = rep.toList();
            clients.forEach(System.out::println);
            System.out.println("#...  pageable");
            List<Client> pageable = rep.toList(0, 3);
            pageable.forEach(System.out::println);

            System.out.println("#....  Oder ");
            List<Client> clientSortable = rep.toList("username", Direction.ASC);
            for (Client c : clientSortable) {
                System.out.println(c);
            }

            System.out.println("#...  Edit   ");
            Client dataEdit = new Client("Emilio", "Jimenez");
            dataEdit.setId(1);
            rep.edit(dataEdit);

            Client emilio = rep.elementById(1);
            System.out.println(emilio);
            System.out.println();
            rep.toList("username", Direction.DESC).forEach(System.out::println);

            System.out.println("#... Delete  ");
            rep.delete(3);
            rep.toList().forEach(System.out::println);
            System.out.println("#.. Total records -> " + rep.total());

        } catch ( DuplicateRecordAccessDataException e ){
            System.out.println("#Duplicate record "+e.getMessage());
            e.printStackTrace();
        } catch ( ReadAccessDataException e ){
            System.out.println("#Read "+e.getMessage());
            e.printStackTrace();
        } catch ( WritingAccessDataException e){
            System.out.println("#Writing "+e.getMessage());
            e.printStackTrace();
        } catch ( AccessDataException e){
            System.out.println("#Generic "+ e.getMessage());
            e.printStackTrace();
        }

    }
}

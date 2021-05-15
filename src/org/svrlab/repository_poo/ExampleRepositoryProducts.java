package org.svrlab.repository_poo;

import org.svrlab.repository_poo.model.Product;
import org.svrlab.repository_poo.repository.Direction;
import org.svrlab.repository_poo.repository.IndexRepository;
import org.svrlab.repository_poo.repository.exeception.AccessDataException;
import org.svrlab.repository_poo.repository.exeception.ReadAccessDataException;
import org.svrlab.repository_poo.repository.list.ProductListRepository;

import java.util.List;

public class ExampleRepositoryProducts {

    public static void main(String[] args) {

        try {
            IndexRepository<Product> rep = new ProductListRepository();
            rep.create(new Product("Table", 1000.52));
            rep.create(new Product("Chair", 1800));
            rep.create(new Product("Lamp", 1150.58));
            rep.create(new Product("Notebook", 9500.58));

            List<Product> products = rep.toList();
            products.forEach(System.out::println);
            System.out.println("#...  pageable");
            List<Product> pageable = rep.toList(0, 3);
            pageable.forEach(System.out::println);

            System.out.println("#....  Oder ");
            List<Product> productSortable = rep.toList("description", Direction.ASC);
            for (Product c : productSortable) {
                System.out.println(c);
            }

            System.out.println("#...  Edit   ");
            Product lampEdit = new Product("Desk lamp", 2300);
            lampEdit.setId(3);
            rep.edit(lampEdit);

            Product lamp = rep.elementById(3);
            System.out.println(lamp);
            System.out.println();
            rep.toList("cost", Direction.ASC).forEach(System.out::println);

            System.out.println("#... Delete  ");
            rep.delete(2);
            rep.toList().forEach(System.out::println);
            System.out.println("#.. Total records -> " + rep.total());

        } catch ( ReadAccessDataException e ){
            System.out.println( e.getMessage());
            e.printStackTrace();
        } catch ( AccessDataException e){
            System.out.println( e.getMessage());
            e.printStackTrace();
        }

    }
}

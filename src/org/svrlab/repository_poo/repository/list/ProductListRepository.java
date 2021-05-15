package org.svrlab.repository_poo.repository.list;


import org.svrlab.repository_poo.model.Product;
import org.svrlab.repository_poo.repository.AbstractListRepository;
import org.svrlab.repository_poo.repository.Direction;
import org.svrlab.repository_poo.repository.exeception.ReadAccessDataException;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository extends AbstractListRepository<Product> {

    @Override
    public void edit(Product product) throws ReadAccessDataException {
        Product product1 = elementById( product.getId() );
        product1.setDescription( product.getDescription() );
        product1.setCost( product.getCost() );
    }

    @Override
    public List<Product> toList(String field, Direction dir) {
        List<Product> orderedList = new ArrayList<>(this.dataSource);
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

    public static int order( String field, Product a, Product b){
        int result = 0;
        switch ( field) {
            case "id" ->
                    result = a.getId().compareTo( b.getId() );
            case "description" ->
                    result = a.getDescription().compareTo( b.getDescription());
            case  "cost" ->
                    result = a.getCost().compareTo( b.getCost());
        }
        return result;
    }
}

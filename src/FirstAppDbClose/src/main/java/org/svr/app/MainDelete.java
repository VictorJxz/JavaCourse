package org.svr.app;

import org.svr.app.models.Product;
import org.svr.app.repository.ProductRepository;
import org.svr.app.repository.Repository;

public class MainDelete {

    // # 2

    public static void main(String[] args) {

        Repository<Product> repository = new ProductRepository();
        System.out.println("..........      toList      ........");
        repository.toList().forEach(  System.out::println );

        System.out.println(".......     byId        ...........");
        System.out.println( repository.byId(2l));

        System.out.println(".......     deleteProduct        ...........");
        repository.delete( 3L);
        System.out.println("Product successfully saved");

        System.out.println(".......     toListProduct        ...........");
        repository.toList().forEach(  System.out::println );

    }
}

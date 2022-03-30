package org.svr.app;

import org.svr.app.models.Product;
import org.svr.app.repository.ProductRepository;
import org.svr.app.repository.Repository;
import org.svr.app.util.DataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        try (Connection connection = DataBase.getInstance() ){

            Repository<Product> repository = new ProductRepository();
            System.out.println("..........      toList      ........");
            repository.toList().forEach(  System.out::println );

            System.out.println(".......     byId        ...........");
            System.out.println( repository.byId(2l));

            System.out.println(".......     createProduct        ...........");
            Product product = new Product();
            product.setProduct("Mechanical keyboard");
            product.setPrice(500);
            product.setCreateAt( new Date());
            repository.save( product );
            System.out.println("Product successfully saved");

            System.out.println(".......     createProduct        ...........");
            repository.toList().forEach(  System.out::println );


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

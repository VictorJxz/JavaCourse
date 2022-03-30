package org.svr.app;

import org.svr.app.models.Category;
import org.svr.app.models.Product;
import org.svr.app.repository.ProductRepository;
import org.svr.app.repository.Repository;
import org.svr.app.util.DataBase;

import java.sql.Connection;
import java.sql.SQLException;


public class MainTrx {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DataBase.getInstance() ){

            if ( connection.getAutoCommit() ) {
                connection.setAutoCommit( true );
            }
            try {
                Repository<Product> repository = new ProductRepository();
                System.out.println("..........      toList      ........");
                repository.toList().forEach(System.out::println);

                System.out.println(".......     byId        ...........");
                System.out.println(repository.byId(2l));

                System.out.println(".......     createProduct        ...........");
                Product product = new Product();
                product.setProduct("Mechanical IBM keyboard T7");
                product.setPrice(1500);
                Category category = new Category();
                category.setId(3L);
                product.setCategory(category);
                product.setSku("2918013");
                repository.save(product);


                System.out.println(".......     updateProduct        ...........");
                product.setId(5L);
                product.setProduct("Mechanical IBM Try T7");
                product.setPrice(1870);
                product.setSku("291807");
                category.setId(3L);
                product.setCategory(category);
                repository.save(product);

                System.out.println(".......     createProduct        ...........");
                repository.toList().forEach(System.out::println);
            } catch ( SQLException exception ) {
                connection.rollback();
                exception.printStackTrace();
            }

        }
    }
}

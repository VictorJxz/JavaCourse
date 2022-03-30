package org.svr.app;

import org.svr.app.models.*;
import org.svr.app.repository.*;
import org.svr.app.util.DataBase;

import java.sql.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DataBase.getConnection()) {
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            try {
                Repository<Category> repositoryCategory = new CategoryRepository(connection);
                System.out.println(".......... Insert new category ..........");
                Category category = new Category();
                category.setCategory("Electronics");
                Category newCategory = repositoryCategory.save( category );
                System.out.println("Category successfully saved" + category.getId());

                Repository<Product> repository = new ProductRepository( connection );
                System.out.println("..........      To list     ........");
                repository.toList().forEach(  System.out::println );

                System.out.println(".......     Get by ID     ...........");
                System.out.println( repository.byId(2L));

                System.out.println(".......     Insert new Product        ...........");
                Product product = new Product();
                product.setProduct("Refrigerator Samsung");
                product.setPrice(9900);
                product.setCreateAt( new Date());
                product.setSku("291814");

                product.setCategory( newCategory );
                repository.save( product );
                System.out.println("Product successfully saved" + product.getId());

                System.out.println(".......     createProduct        ...........");
                repository.toList().forEach(  System.out::println );
                connection.commit();
            } catch ( SQLException e) {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }
}

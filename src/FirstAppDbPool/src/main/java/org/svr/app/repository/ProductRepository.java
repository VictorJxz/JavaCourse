package org.svr.app.repository;

import org.svr.app.models.Category;
import org.svr.app.models.Product;
import org.svr.app.util.DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product>{

    private Connection getConnection() throws SQLException {
        return DataBase.getConnection();
    }

    @Override
    public List<Product> toList() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT p.* , c.category as category_c, c.id as id_c" +
                     " FROM products as p inner join categories as c ON (p.id_category = c.id) ")) {

            while ( rs.next() ) {
                Product p = createProduct(rs);
                products.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product byId(Long id) {
        Product product = null;

        try ( Connection connection = getConnection();
              PreparedStatement stmt = connection.prepareStatement(
                      "SELECT p.* , c.category as  category_c, c.id as id_c FROM products as p " +
                        "inner join categories as c ON (p.id_category = c.id)  WHERE p.id = ? ")) {

            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = createProduct(rs);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public void save(Product product) {

        String query;
        if ( product.getId() != null && product.getId() > 0) {
            query = "UPDATE products SET product = ?, price = ?, id_category = ? WHERE id = ?";
        } else {
            query = "INSERT INTO products(product, price, id_category, create_at ) VALUES(?,?,?,?)";
        }

        try ( Connection connection = getConnection();
                PreparedStatement stmt = connection.prepareStatement( query ) ) {

            stmt.setString(1, product.getProduct());
            stmt.setLong( 2, product.getPrice());
            stmt.setLong(3, product.getCategory().getId());

            if ( product.getId() != null && product.getId() > 0 ) {
                stmt.setLong(4, product.getId());
            } else {
                stmt.setDate( 4, new Date(product.getCreateAt().getTime()));
            }
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Long id) {
        try ( PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM products WHERE id = ?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Product createProduct(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setId( rs.getLong("id"));
        p.setProduct( rs.getString("product"));
        p.setPrice( rs.getInt("price"));
        p.setCreateAt( rs.getDate("create_at"));
        Category category = new Category();
        category.setId( rs.getLong("id_c"));
        category.setCategory( rs.getString("category_c"));
        p.setCategory( category );
        return p;
    }


}

package org.svr.app.repository;

import org.svr.app.models.Category;
import org.svr.app.models.Product;
import org.svr.app.util.DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product>{

    private Connection getConnection() throws SQLException {
        return DataBase.getInstance();
    }

    @Override
    public List<Product> toList() throws SQLException {
        List<Product> products = new ArrayList<>();

        try (Statement statement = getConnection().createStatement();
             ResultSet rs = statement.executeQuery("SELECT p.* , c.category as category_c, c.id as id_c" +
                     " FROM products as p inner join categories as c ON (p.id_category = c.id) ")) {

            while ( rs.next() ) {
                Product p = createProduct(rs);
                products.add(p);
            }

        }
        return products;
    }

    @Override
    public Product byId(Long id) throws SQLException {
        Product product = null;

        try (PreparedStatement stmt = getConnection().
                prepareStatement("SELECT p.* , c.category as  category_c, c.id as id_c FROM products as p " +
                        "inner join categories as c ON (p.id_category = c.id)  WHERE p.id = ? ")) {

            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = createProduct(rs);
                }
            }

        }
        return product;
    }

    @Override
    public void save(Product product) throws SQLException {

        String query;
        if ( product.getId() != null && product.getId() > 0) {
            query = "UPDATE products SET product = ?, price = ?, id_category = ?, sku = ? WHERE id = ?";
        } else {
            query = "INSERT INTO products(product, price, id_category, sku, create_at ) VALUES(?,?,?,?,?)";
        }

        try ( PreparedStatement stmt = getConnection().prepareStatement( query ) ) {

            stmt.setString(1, product.getProduct());
            stmt.setLong( 2, product.getPrice());
            stmt.setLong(3, product.getCategory().getId());
            stmt.setString( 4, product.getSku());

            if ( product.getId() != null && product.getId() > 0 ) {
                stmt.setLong(5, product.getId());
            } else {
                stmt.setDate( 5, new Date(product.getCreateAt().getTime()));
            }
            stmt.executeUpdate();

        }

    }

    @Override
    public void delete(Long id) throws SQLException {
        try ( PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM products WHERE id = ?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }

    private Product createProduct(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setId( rs.getLong("id"));
        p.setProduct( rs.getString("product"));
        p.setPrice( rs.getInt("price"));
        p.setCreateAt( rs.getDate("create_at"));
        p.setSku( rs.getString("sku"));
        Category category = new Category();
        category.setId( rs.getLong("id_c"));
        category.setCategory( rs.getString("category_c"));
        p.setCategory( category );
        return p;
    }


}

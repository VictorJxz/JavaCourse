package org.svr.app.repository;

import org.svr.app.models.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements Repository<Category>{

    private Connection connection;

    public CategoryRepository(Connection connection) {
        this.connection = connection;
    }

    public CategoryRepository() {
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Category> toList() throws SQLException {
        List<Category> categories = new ArrayList<>();
        try ( Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM categories ")) {
            while ( rs.next() ) {
                categories.add( createCategory(rs) );
            }
        }
        return categories;
    }

    @Override
    public Category byId(Long id) throws SQLException {
        Category category = null;
        try ( PreparedStatement stmt = connection.prepareStatement("SELECT * FROM categories as c WHERE c.id=? ")){
            stmt.setLong( 1, id);
            try ( ResultSet rs = stmt.executeQuery() ) {
                if ( rs.next() ) {
                    category = createCategory( rs );
                }
            }
        }
        return category;
    }

    @Override
    public Category save(Category category) throws SQLException {
        String query = null;
        if ( category.getId() != null && category.getId() > 0 ) {
            query = "UPDATE categories SET category= ? WHERE id = ?";
        } else {
            query = "INSERT INTO categories(category) VALUES(?)";
        }
        try( PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS )) {
            stmt.setString(1, category.getCategory() );
            if ( category.getId() != null && category.getId() > 0) {
                stmt.setLong(2, category.getId() );
            }
            stmt.executeUpdate();
            if (category.getId() == null ) {
                try(ResultSet rs = stmt.getGeneratedKeys() ){
                    if (rs.next()) {
                        category.setId(rs.getLong(1));
                    }
                }
            }
        }
        return category;
    }

    @Override
    public void delete(Long id) throws SQLException {
        try (PreparedStatement stmt = connection.prepareStatement("DELETE FROM categories WHERE id=?")) {
            stmt.setLong( 1, id);
            stmt.executeUpdate();
        }
    }

    private Category createCategory(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setId( rs.getLong("id"));
        category.setCategory( rs.getString("category"));
        return category;
    }
}

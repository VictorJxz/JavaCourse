package org.svr.app.service;

import org.svr.app.models.*;

import java.sql.SQLException;
import java.util.List;

public interface Service {

    List<Product> list() throws SQLException;
    Product productById(Long id) throws SQLException;
    Product save(Product product) throws SQLException;
    void delete(Long id) throws SQLException;

    List<Category> listCategory() throws SQLException;
    Category saveCategory( Category category) throws SQLException;
    void deleteCategory(Long id) throws  SQLException;
    void saveProductCategory(Product p, Category c) throws SQLException;
}

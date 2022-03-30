package org.svr.app.service;

import org.svr.app.models.Category;
import org.svr.app.models.Product;
import org.svr.app.repository.CategoryRepository;
import org.svr.app.repository.ProductRepository;
import org.svr.app.repository.Repository;

import java.sql.SQLException;
import java.util.List;

public class ServiceTrx implements Service{

    private Repository<Product> productRepository;
    private Repository<Category> categoryRepository;

    public ServiceTrx() {
        this.productRepository = new ProductRepository();
        this.categoryRepository = new CategoryRepository();
    }

    @Override
    public List<Product> list() throws SQLException {
        return null;
    }

    @Override
    public Product productById(Long id) throws SQLException {
        return null;
    }

    @Override
    public Product save(Product product) throws SQLException {
        return null;
    }

    @Override
    public void delete(Long id) throws SQLException {

    }

    @Override
    public List<Category> listCategory() throws SQLException {
        return null;
    }

    @Override
    public Category saveCategory(Category category) throws SQLException {
        return null;
    }

    @Override
    public void deleteCategory(Long id) throws SQLException {

    }

    @Override
    public void saveProductCategory(Product p, Category c) throws SQLException {

    }
}

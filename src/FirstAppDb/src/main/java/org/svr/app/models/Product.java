package org.svr.app.models;

import java.util.Date;

public class Product {

    private Long id;
    private String product;
    private Integer price;
    private Date createAt;
    private Category category;

    public Product() {
    }

    @Override
    public String toString() {
        return  id + " | " + product + " | " + price + " | " + createAt + " | " + category.getCategory() ;
    }

    public Product(Long id, String product, Integer price, Date create_at) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.createAt = create_at;
    }

    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

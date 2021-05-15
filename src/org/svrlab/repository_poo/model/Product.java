package org.svrlab.repository_poo.model;

public class Product extends BaseEntity{

    private String description;
    private Double cost;

    public Product(String description, double cost) {
        super();
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id: " + id + " description: " + description + " cost: " + cost ;
    }
}

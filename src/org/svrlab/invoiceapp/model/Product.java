package org.svrlab.invoiceapp.model;

public class Product {

    private int code;
    private String name;
    private double price;
    private static int lastCode;

    public Product() {
        this.code = ++lastCode;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPressure() {
        return price;
    }

    public void setPressure(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  code + "\t" + name + "\t" + price ;
    }
}

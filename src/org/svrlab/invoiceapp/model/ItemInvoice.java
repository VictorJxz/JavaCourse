package org.svrlab.invoiceapp.model;

public class ItemInvoice {

    private int quantity;
    private Product product;

    public ItemInvoice(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calculateAmount() {
        return this.quantity * this.product.getPressure();
    }

    @Override
    public String toString() {
        return product.toString() + " \t " + quantity + "\t " + calculateAmount();
    }
}

package org.svrlab.design_patron.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProduct {

    protected String name;
    protected String mass;
    protected String sauce;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public void setUp() {
        System.out.println("Set up " + name);
        System.out.println("Selecting the mass " + mass);
        System.out.println("Adding sauces " + sauce);
        System.out.println("Adding ingredients : ");
        this.ingredients.forEach( System.out::println );
    }

    public abstract void cook();
    public abstract void cotOff();

    public void packingPizza() {
        System.out.println("Packing the pizza ...");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

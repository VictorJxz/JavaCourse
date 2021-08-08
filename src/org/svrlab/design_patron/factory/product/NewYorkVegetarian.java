package org.svrlab.design_patron.factory.product;

import org.svrlab.design_patron.factory.PizzaProduct;

public class NewYorkVegetarian extends PizzaProduct {

    public NewYorkVegetarian() {
        super();
        name = "Pizza vegetarian New York";
        mass = "Mass integral vegan";
        sauce = "Ketchup";
        ingredients.add("Vegan cheese");
        ingredients.add("Tomatoes");
        ingredients.add("Olives");
        ingredients.add("Spinach");
        ingredients.add("Eggplant");
    }

    @Override
    public void cook() {
        System.out.println("Cooking for 25 min. at 150°C ");
    }

    @Override
    public void cotOff() {
        System.out.println("Counting in square slice.");
    }

}

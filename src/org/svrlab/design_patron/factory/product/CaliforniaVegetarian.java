package org.svrlab.design_patron.factory.product;

import org.svrlab.design_patron.factory.PizzaProduct;

public class CaliforniaVegetarian extends PizzaProduct {


    public CaliforniaVegetarian() {
        super();
        name = "Pizza California vegetarian";
        mass = "Light corn dough";
        sauce = "Sauce BBQ Light";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olives");
        ingredients.add("Spinach");
        ingredients.add("Onion");
        ingredients.add("Eggplant");
    }

    @Override
    public void cook() {
        System.out.println("Cooking fro 20min. at 180°C");
    }

    @Override
    public void cotOff() {
        System.out.println("Count in rectangular slices");
    }

}

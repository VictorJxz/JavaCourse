package org.svrlab.design_patron.factory.product;

import org.svrlab.design_patron.factory.PizzaProduct;

public class CaliforniaCheese extends PizzaProduct {

    public CaliforniaCheese() {
        super();
        name = "Pizza California Cheese";
        mass = "Light corn dough";
        sauce = "Sauce rucula";
        ingredients.add("Extra mozzarella cheese");
        ingredients.add("Onion");
        ingredients.add("Blue cheese");


    }

    @Override
    public void cook() {
        System.out.println("Cooking for 35min. a 100°C ");
    }

    @Override
    public void cotOff() {
        System.out.println("Cut into triangles");
    }
}

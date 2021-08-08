package org.svrlab.design_patron.factory.product;

import org.svrlab.design_patron.factory.PizzaProduct;

public class NewYorkItalian extends PizzaProduct {

    public NewYorkItalian() {
        super();
        name = "Pizza Italian New York";
        mass = "Thick corn dough";
        sauce = "Italian meat tomato sauce";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olive");
        ingredients.add("Ham");
        ingredients.add("Chorizo");
        ingredients.add("Mushrooms");

    }

    @Override
    public void cook() {
        System.out.println("Cooking for 30 min. at 120°C ");
    }

    @Override
    public void cotOff() {
        System.out.println("Cut the pizza into triangle");
    }
}

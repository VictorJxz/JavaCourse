package org.svrlab.design_patron.factory.product;

import org.svrlab.design_patron.factory.PizzaProduct;

public class NewYorkPepperoni extends PizzaProduct {

    public NewYorkPepperoni() {
        super();
        name = "Pizza pepperoni New York";
        mass = "Thin corn dough on the stone";
        sauce = "Ketchup";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Extra pepperoni");
        ingredients.add("Olives");

    }

    @Override
    public void cook() {
        System.out.println("Cooking for 40 min. at 90°C ");
    }

    @Override
    public void cotOff() {
        System.out.println("Cut the pizza into triangles");
    }
}

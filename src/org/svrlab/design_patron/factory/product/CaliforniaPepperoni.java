package org.svrlab.design_patron.factory.product;

import org.svrlab.design_patron.factory.PizzaProduct;

public class CaliforniaPepperoni extends PizzaProduct {

    public CaliforniaPepperoni() {
        super();
        name = "Pizza California pepperoni";
        mass = "Light corn dough";
        ingredients.add("Pepperoni");
        ingredients.add("Extra mozzarella cheese");
        ingredients.add("Olives");



    }

    @Override
    public void cook() {
        System.out.println("Cooking for 50 min. at 55°C ");
    }

    @Override
    public void cotOff() {
        System.out.println("Cut into rectangles");
    }


}

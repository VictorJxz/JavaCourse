package org.svrlab.design_patron.factory;

import org.svrlab.design_patron.factory.product.NewYorkItalian;
import org.svrlab.design_patron.factory.product.NewYorkPepperoni;
import org.svrlab.design_patron.factory.product.NewYorkVegetarian;

public class PizzaNewYorkFactory extends PizzaZoneAbstractFactory{

    @Override
    PizzaProduct createPizza(String type) {
        /* Java 13 */
        return switch (type) {
            case "vegan" -> new NewYorkVegetarian();
            case "pepperoni" -> new NewYorkPepperoni();
            case "italian" -> new NewYorkItalian();
            default -> null;
        };

/*        PizzaProduct poduct = null;

        switch ( type ) {
            case "vegan":
                poduct = new NewYorkVegetarian();
                break;
            case "pepperoni":
                poduct = new NewYorkPepperoni();
                break;
            case "italian":
                poduct = new NewYorkItalian();
                break;
        }
        return poduct;*/
    }


}

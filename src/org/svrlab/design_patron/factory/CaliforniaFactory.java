package org.svrlab.design_patron.factory;

import org.svrlab.design_patron.factory.product.CaliforniaCheese;
import org.svrlab.design_patron.factory.product.CaliforniaPepperoni;
import org.svrlab.design_patron.factory.product.CaliforniaVegetarian;

public class CaliforniaFactory extends PizzaZoneAbstractFactory {

    @Override
    PizzaProduct createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaCheese();
            case "pepperoni" -> new CaliforniaPepperoni();
            case "vegetarian" -> new CaliforniaVegetarian();
            default -> null;
        };
    }

}

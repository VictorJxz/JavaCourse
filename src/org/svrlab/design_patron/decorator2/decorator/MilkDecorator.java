package org.svrlab.design_patron.decorator2.decorator;

import org.svrlab.design_patron.decorator2.Configurable;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Configurable caffee) {
        super(caffee);
    }

    @Override
    public float getBasePrice() {
        return caffee.getBasePrice() + 3.7f;
    }

    @Override
    public String getIngredients() {
        return caffee.getIngredients() + ", Milk";
    }
}

package org.svrlab.design_patron.decorator2.decorator;

import org.svrlab.design_patron.decorator2.Configurable;

public class CreamDecorator extends CoffeeDecorator {

    public CreamDecorator(Configurable caffee) {
        super(caffee);
    }

    @Override
    public float getBasePrice() {
        return caffee.getBasePrice() + 2.5f;
    }

    @Override
    public String getIngredients() {
        return caffee.getIngredients() + ", Cream";
    }
}

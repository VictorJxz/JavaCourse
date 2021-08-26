package org.svrlab.design_patron.decorator2.decorator;

import org.svrlab.design_patron.decorator2.Configurable;

public class ChocolateDecorator  extends CoffeeDecorator {


    public ChocolateDecorator( Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return caffee.getBasePrice() + 5f;
    }

    @Override
    public String getIngredients() {
        return caffee.getIngredients() + ", Chocolate" ;
    }
}

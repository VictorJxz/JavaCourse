package org.svrlab.design_patron.decorator2.decorator;

import org.svrlab.design_patron.decorator2.Configurable;

public abstract class CoffeeDecorator implements Configurable {

    protected Configurable caffee;

    public CoffeeDecorator(Configurable caffee) {
        this.caffee = caffee;
    }
}

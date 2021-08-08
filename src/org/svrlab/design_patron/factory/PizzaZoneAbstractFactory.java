package org.svrlab.design_patron.factory;

abstract public class PizzaZoneAbstractFactory {

    public PizzaProduct orderPizza(String type) {

        PizzaProduct pizza = createPizza(type);
        System.out.println("Making the pizza -> " + pizza.getName());
        pizza.setUp();
        pizza.cook();
        pizza.cotOff();
        pizza.packingPizza();
        return pizza;

    }

    abstract PizzaProduct createPizza( String type );
}

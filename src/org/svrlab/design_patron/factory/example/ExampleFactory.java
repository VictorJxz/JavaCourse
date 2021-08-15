package org.svrlab.design_patron.factory.example;

import org.svrlab.design_patron.factory.CaliforniaFactory;
import org.svrlab.design_patron.factory.PizzaNewYorkFactory;
import org.svrlab.design_patron.factory.PizzaProduct;
import org.svrlab.design_patron.factory.PizzaZoneAbstractFactory;

public class ExampleFactory {

    public static void main(String[] args) {

        PizzaZoneAbstractFactory newYork = new PizzaNewYorkFactory();
        PizzaZoneAbstractFactory california = new CaliforniaFactory();

        PizzaProduct pizza = california.orderPizza("cheese" );
        System.out.println("Ordering the pizza[1] " + pizza.getName());

        pizza = newYork.orderPizza("pepperoni");
        System.out.println("Ordering the pizza[2] " + pizza.getName());

        pizza = california.orderPizza("vegetarian");
        System.out.println("Ordering the pizza[3] " + pizza.getName());

        pizza = newYork.orderPizza("italian");
        System.out.println("Ordering the pizza[4] " + pizza.getName());

        pizza = california.orderPizza("pepperoni");
        System.out.println("Ordering the pizza[5] " + pizza.getName());

        System.out.println( pizza );


    }
}

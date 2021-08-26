package org.svrlab.design_patron.decorator2;

import org.svrlab.design_patron.decorator2.decorator.ChocolateDecorator;
import org.svrlab.design_patron.decorator2.decorator.CreamDecorator;
import org.svrlab.design_patron.decorator2.decorator.MilkDecorator;

public class ExampleDecorator {

    public static void main(String[] args) {

        Configurable caffee = new Coffee(7,"Coffee Mocha");

        CreamDecorator cream = new CreamDecorator( caffee );
        MilkDecorator milk = new MilkDecorator( cream );
        ChocolateDecorator chocolate = new ChocolateDecorator( milk );

        System.out.println("Price coffee mocha chocolate -> " + chocolate.getBasePrice());
        System.out.println("Ingredients -> " + chocolate.getIngredients());
    }


}

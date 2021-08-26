package org.svrlab.design_patron.decorator;

import org.svrlab.design_patron.decorator.decorator.ReplaceSpaceDecorator;
import org.svrlab.design_patron.decorator.decorator.ReverseDecorator;
import org.svrlab.design_patron.decorator.decorator.UnderlineDecorator;
import org.svrlab.design_patron.decorator.decorator.UppercaseDecorator;

public class ExampleDecorator {

    public static void main(String[] args) {

        Formatted text = new Text("Hello world test!");

        UppercaseDecorator uppercase = new UppercaseDecorator( text );
        ReverseDecorator reverse = new ReverseDecorator( uppercase );
        UnderlineDecorator underline = new UnderlineDecorator( reverse );
        ReplaceSpaceDecorator replace = new ReplaceSpaceDecorator(  underline );

        System.out.println( replace.format() );
    }


}

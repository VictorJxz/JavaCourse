package org.svrlab.design_patron.decorator.decorator;

import org.svrlab.design_patron.decorator.Formatted;

public class ReverseDecorator extends TextDecorator {

    public ReverseDecorator(Formatted text) {
        super(text);
    }

    @Override
    public String format() {
        StringBuilder stringBuilder = new StringBuilder( text.format() );
        return stringBuilder.reverse().toString();
    }
}

package org.svrlab.design_patron.decorator.decorator;

import org.svrlab.design_patron.decorator.Formatted;

public class UppercaseDecorator extends TextDecorator {

    public UppercaseDecorator(Formatted text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().toUpperCase();
    }
}

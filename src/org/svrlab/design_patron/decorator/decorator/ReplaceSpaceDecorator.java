package org.svrlab.design_patron.decorator.decorator;

import org.svrlab.design_patron.decorator.Formatted;

public class ReplaceSpaceDecorator extends TextDecorator{


    public ReplaceSpaceDecorator(Formatted text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().replace(" ","_");
    }
}

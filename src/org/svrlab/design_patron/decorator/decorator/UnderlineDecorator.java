package org.svrlab.design_patron.decorator.decorator;

import org.svrlab.design_patron.decorator.Formatted;

public class UnderlineDecorator extends  TextDecorator{

    public UnderlineDecorator(Formatted text) {
        super(text);
    }

    @Override
    public String format() {

        int textLength = text.format().length();
        StringBuilder stringBuilder = new StringBuilder(text.format());
        stringBuilder.append("\n");

        for (int i = 0; i < textLength; i++) {
            stringBuilder.append("_");
        }
        return stringBuilder.toString();
    }
}

package org.svrlab.design_patron.decorator.decorator;

import org.svrlab.design_patron.decorator.Formatted;

public abstract class TextDecorator implements Formatted {

    /* the abstract classes are not required to implement the methods but the children are */

    protected Formatted text;

    public TextDecorator(Formatted text) {
        this.text = text;
    }

}

package org.svrlab.design_patron.decorator;

public class Text implements Formatted {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String format() {
        return getText();
    }


}

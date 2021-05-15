package org.svrlab.classabstract.form.element.select;

public class Option {

    private String key;
    private String value;
    private boolean selected;

    public Option() {
    }

    public Option(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public Option setSelected() {
        this.selected = true;
        return this;
    }
}

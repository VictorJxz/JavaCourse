package org.svrlab.interfaces.printing.model;

public class Page extends Leaf implements Printable{

    public Page(String contents) {
        super(contents);
    }

    @Override
    public String print() {
        return this.contents;
    }
}

package org.svrlab.interfaces.printing.model;

public abstract class Leaf {

    protected String contents;

    public Leaf(String contents) {
        this.contents = contents;
    }

    abstract public String print();


}

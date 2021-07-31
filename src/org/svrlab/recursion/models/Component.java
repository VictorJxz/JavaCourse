package org.svrlab.recursion.models;

import java.util.ArrayList;
import java.util.List;

public class Component {

    private String name;
    private List<Component> children;
    private  int level;

    public Component(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getChild() {
        return children;
    }

    public void setChild(List<Component> child) {
        this.children = child;
    }

    public Component addComponent( Component component){
        this.children.add( component );
        return this;
    }

    public boolean hasChildren() {
        return !this.children.isEmpty();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

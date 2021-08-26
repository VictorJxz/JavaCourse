package org.svrlab.design_patron.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver( Observer observer ) {
        observers.add( observer);
    }

    public void remove( Observer observer ) {
        observers.remove( observer );
    }

    public void notifyObserver() {
        notifyObserver( null);
    }

    public void notifyObserver( Object object) {

        for ( Observer observer: this.observers ) {
            observer.update( this, object);
        }
    }
}

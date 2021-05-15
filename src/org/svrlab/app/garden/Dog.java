package org.svrlab.app.garden;

import org.svrlab.app.home.Person;

public class Dog {

    protected String name;
    protected String breed;

    String play(Person person) {
        return person.throwBall();
    }
}

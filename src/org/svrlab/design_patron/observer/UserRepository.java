package org.svrlab.design_patron.observer;

import java.util.ArrayList;
import java.util.List;

public class UserRepository extends Observable {

    private List<String> repository = new ArrayList<>();

    public void createUser(String user) {
        repository.add( user );
        notifyObserver( user );
    }
}

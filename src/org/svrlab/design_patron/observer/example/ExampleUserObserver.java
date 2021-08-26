package org.svrlab.design_patron.observer.example;

import org.svrlab.design_patron.observer.UserRepository;

public class ExampleUserObserver {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();
        repository.addObserver( (observable, user) -> System.out.println("Sending an email to the user " + user));
        repository.addObserver( (observable, user) -> System.out.println("Sending an email to the admin " + user));

        repository.addObserver( (observable, user) ->
                System.out.println("Saving user "+ user + " information in the Logs"));

        repository.createUser("Qubit01");
    }


}

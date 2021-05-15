package org.svrlab.repository_poo.model;


public class Client extends BaseEntity{

    private String username;
    private String surname;

    public Client(String username, String surname) {
        super();
        this.username = username;
        this.surname = surname;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "id: " + id + ", username: " + username + ", surname: " + surname  ;
    }

}

package org.svrlab.api_stream.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String username;
    private String surname;
    private Integer id;
    private  static int lastId;

    private List<Invoice> invoices;

    public User(String username, String surname) {
        this.username = username;
        this.surname = surname;
        this.id = ++lastId;
        this.invoices = new ArrayList<>();
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoices) {
        this.invoices.add(invoices);
        invoices.setUser(this);
    }

    public Integer getId() {
        return id;
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
        return  username + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && surname.equals(user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, surname);
    }
}

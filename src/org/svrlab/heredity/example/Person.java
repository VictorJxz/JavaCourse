package org.svrlab.heredity.example;

public class Person {

    protected String username;
    protected String surname;
    protected int age;
    protected String email;

    public Person(){
        System.out.println("Start constructor Person()...");
    }

    public Person( String username, String surname) {
        this.username = username;
        this.surname = surname;
    }

    public Person( String username, String surname, int age ){
        this( username, surname);
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String greeting() {
        return "Hi, How are you!";
    }

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email +
                ", greet=" + this.greeting();
    }
}

package POO;

public class Person {

    private String username;
    private String surname;

    public Person(String username, String surname) {
        this.username = username;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  username + " '" + surname;
    }
}

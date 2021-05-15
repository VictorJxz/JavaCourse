package org.svrlab.app.home;


public class Person {

    private String username;
    private String surname;

    public static final String MEN_GENDER = "MEN";
    public static final String WOMAN_GENDER = "WOMAN";
    private HairColor hairColor;

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

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public String throwBall(){
        return "Throw ball to the dog!";
    }

    public static String greet(){
        return "Hi, How are you!";
    }
}

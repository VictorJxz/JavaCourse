package org.svrlab.heredity.example;

public class Teacher extends Person {

    private String course;

    public Teacher() {
        System.out.println("Start teacher...");
    }

    public Teacher( String username, String surname){
        super(username, surname);
    }

    public Teacher( String username, String surname, String course){
        super( username, surname);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String greeting() {
        return "Good morning, I'm the teacher of " + getCourse()+" My name is "+getUsername();
    }

    @Override
    public String toString() {
        return super.toString() + "\ncourse='" + course + '\'' ;
    }
}

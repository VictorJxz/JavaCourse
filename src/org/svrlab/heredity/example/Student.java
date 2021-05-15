package org.svrlab.heredity.example;


public class Student extends Person {

    private String school;
    private double noteMath;
    private double noteSpanish;
    private double noteHistory;

    public Student() {
        super();
        System.out.println("Start student...");
    }

    public Student( String username, String surname ){
        super(username, surname);
    }

    public Student( String username, String surname, int age ){
        super( username, surname, age);
    }

    public Student( String username, String surname, int age, String school){
        super( username, surname, age);
        this.school = school;
    }

    public Student( String username, String surname, int age, String school, double noteMath, double noteHistory, double noteSpanish) {
        this( username, surname, age, school);
        this.noteMath = noteMath;
        this.noteHistory = noteHistory;
        this.noteSpanish = noteSpanish;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getNoteMath() {
        return noteMath;
    }

    public void setNoteMath(double noteMath) {
        this.noteMath = noteMath;
    }

    public double getNoteSpanish() {
        return noteSpanish;
    }

    public void setNoteSpanish(double noteLenguage) {
        this.noteSpanish = noteLenguage;
    }

    public double getNoteHistory() {
        return noteHistory;
    }

    public void setNoteHistory(double noteHistory) {
        this.noteHistory = noteHistory;
    }

    @Override
    public String greeting(){
        String greet = super.greeting();
        return greet+" how am I student and my name is "+ getUsername();
    }

    public double calculateAverage(){
        //System.out.println("Calculate average "+ Student.class.getCanonicalName());
        return (noteHistory + noteSpanish + noteMath) / 3;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nschool='" + school + '\'' +
                ", noteMath=" + noteMath +
                ", noteSpanish=" + noteSpanish +
                ", noteHistory=" + noteHistory +
                ", calculate average=" + this.calculateAverage();
    }
}

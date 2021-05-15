package org.svrlab.heredity.example;

public final class InternationalStudent extends  Student{

    private String country;
    private double noteLanguage;

    public InternationalStudent() {
        System.out.println("Start international student...");
    }

    public InternationalStudent( String username, String surname){
        super( username, surname );
    }

    public InternationalStudent( String username, String surname, String country){
        super( username, surname);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getNoteLanguage() {
        return noteLanguage;
    }

    public void setNoteLanguage(double noteLanguage) {
        this.noteLanguage = noteLanguage;
    }

    @Override
    public String greeting() {
        return super.greeting()+" I'm a foreign student I'm from "+ getCountry();
    }

    @Override
    public double calculateAverage() {
        System.out.println("Calculate average "+InternationalStudent.class.getCanonicalName() );
        return ((super.calculateAverage()*3) + noteLanguage) / 4;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncountry='" + country + '\'' +
                ", noteLanguage=" + noteLanguage ;
    }
}

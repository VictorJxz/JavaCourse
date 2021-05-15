package org.svrlab.interfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Leaf implements Printable{

    private Person person;
    private String career;
    private List<String> experiences;

    public Resume(Person person, String career, String contents) {
        super(contents);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }

    public Resume addExperiences( String exp){
        experiences.add( exp );
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append( person).append("\n")
                .append("Resume: ").append( this.contents)
                .append("\n").append("Profession: ").append(career)
                .append("\n").append("Experiences: \n");
        for (String exp: this.experiences){
            sb.append("- ").append( exp ).append("\n");
        }
        return sb.toString();
    }
}

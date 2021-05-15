package org.svrlab.interfaces.printing;

import org.svrlab.interfaces.printing.model.*;
import static org.svrlab.interfaces.printing.model.Gender.*;
import static org.svrlab.interfaces.printing.model.Printable.*;

public class ExamplePrinting {

    public static void main(String[] args) {

        Resume cv = new Resume(new Person("Victor","Jxz"),"Ing. Software", "Job summary");
        cv.addExperiences("Java")
        .addExperiences("Oracle DBA")
        .addExperiences("Spring framework")
        .addExperiences("Developer fullstack")
        .addExperiences("Angular");

        Book book = new Book(new Person("Erich","Gamma"),"Design pattern Elem. Reusable POO", PROGRAMMING);
        book.addPage( new Page("Singleton pattern"))
                .addPage( new Page("Observer pattern"))
                .addPage( new Page("Factory pattern"))
                .addPage( new Page("Composite pattern"))
                .addPage( new Page("Facade pattern"));

        Report report = new Report(new Person("Martin","Fowler"),
                new Person("James","Gosling"),"Microservices study");
        print( cv );
        print( report );
        print( book );


        print( new Printable() {
            @Override
            public String print() {
                return "Printing an object in an anonymous class!";
            }
        });

        System.out.println( DEFAULT_TEXT );
    }

}

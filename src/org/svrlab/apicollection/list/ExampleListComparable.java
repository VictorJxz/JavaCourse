package org.svrlab.apicollection.list;

import org.svrlab.apicollection.model.Student;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class ExampleListComparable {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Username", 5));
        students.add(new Student("Username2", 6));
        students.add( new Student("Username3", 4));
        students.add(new Student("Username4", 7));
        students.add(new Student("Username5", 3));
        students.add( new Student("Username6", 2));

        students.add( new Student("Username7", 2));
        students.add( new Student("Username7", 3));

        //Collections.sort( students, (a, b) -> b.getUsername().compareTo(a.getUsername()) );
        //students.sort((a, b) -> b.getUsername().compareTo(a.getUsername()));

        //Java 8
        students.sort(comparing(Student::getUsername).reversed());

        System.out.println("Iterating using lambda expressions ");
        students.forEach( System.out::println );
    }
}

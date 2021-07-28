package org.svrlab.apicollection.set;

import org.svrlab.apicollection.model.Student;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSetComparable {

    public static void main(String[] args) {

        //Set<Student> students = new TreeSet<>((a,b) -> b.getNote().compareTo(a.getNote()));
        Set<Student> students = new TreeSet<>( comparing( Student::getUsername ).reversed() );
        students.add(new Student("Username", 5));
        students.add(new Student("Username2", 6));
        students.add( new Student("Username3", 4));
        students.add(new Student("Username4", 7));
        students.add(new Student("Username5", 3));
        students.add( new Student("Username6", 2));
        students.add( new Student("Username7", 2));
        students.add( new Student("Username7", 8));

        System.out.println("students = " + students);
    }
}

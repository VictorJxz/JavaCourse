package org.svrlab.apicollection.set;

import org.svrlab.apicollection.model.Student;

import java.util.*;

public class ExampleHashSetUniqueness {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        //List<Student> students = new ArrayList<>();

        students.add(new Student("Username", 5));
        students.add(new Student("Username2", 6));
        students.add( new Student("Username3", 4));
        students.add(new Student("Username4", 7));
        students.add(new Student("Username5", 3));
        students.add( new Student("Username6", 2));

        students.add( new Student("Username7", 2));
        students.add( new Student("Username7", 3));

        System.out.println(students);/*

        System.out.println("Iterating using for classic");
        for( int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            System.out.println( student.getUsername() );
        }*/

        System.out.println("Iterating using Foreach");
        for (Student a : students){
            System.out.println(a.getUsername());
        }

        System.out.println("Iterating using while iterator");
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println(student.getUsername());
        }

        System.out.println("Iterating using lambda expressions ");
        students.forEach( System.out::println );
    }
}

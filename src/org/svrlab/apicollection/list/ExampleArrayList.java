package org.svrlab.apicollection.list;

import org.svrlab.apicollection.model.Student;

import java.util.ArrayList;
import java.util.List;


public class ExampleArrayList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        System.out.println( students + " size : " + students.size() );
        System.out.println("Is Empty -> "+ students.isEmpty());

        students.add(new Student("Username", 5));
        students.add(new Student("Username2", 6));
        students.add( new Student("Username3", 4));
        students.add(2,new Student("Username4", 7));
        students.set(3,new Student("Username5", 3));

        System.out.println( students + " size : " + students.size() );

        students.remove( new Student("Username4",7));
        //students.remove( 0);
        System.out.println( students + " size : " + students.size() );

        boolean b = students.contains(new Student("Username",5));
        System.out.println("Contains -> " + b);

        Object a[] = students.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println("Array : "+a[i]);
        }
    }
}

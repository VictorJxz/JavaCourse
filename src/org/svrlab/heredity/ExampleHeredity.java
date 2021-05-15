package org.svrlab.heredity;

import org.svrlab.heredity.example.InternationalStudent;
import org.svrlab.heredity.example.Student;
import org.svrlab.heredity.example.Teacher;

public class ExampleHeredity {

    public static void main(String[] args) {

        System.out.println("#........           Created the instance student    ......" );
        Student student = new Student();
        student.setUsername("@Student");
        student.setSurname("Test Surname");
        student.setSchool("Instituto Nacional");
        student.setNoteSpanish( 8.5 );
        student.setNoteMath( 7.3 );
        student.setNoteHistory( 8.9 );

        System.out.println("#........           Created the instance international student        ......" );
        InternationalStudent intStudent = new InternationalStudent();
        intStudent.setUsername("@Student1 username");
        intStudent.setSurname("Gosling");
        intStudent.setCountry("Australia");
        intStudent.setAge( 15 );
        intStudent.setSchool("Instituto Nacional");
        intStudent.setNoteLanguage(8.8);
        intStudent.setNoteSpanish( 8.9);
        intStudent.setNoteMath(9.5);
        intStudent.setNoteHistory( 9.5);

        System.out.println("#........           Created the instance teacher        ......" );
        Teacher teacher = new Teacher();
        teacher.setUsername("@Username");
        teacher.setSurname("Teacher Surname");
        teacher.setCourse("Math");

        System.out.println();
        System.out.println( student.getUsername() + " " + student.getSurname() +
                " " + student.getSchool() );

        System.out.println( intStudent.getUsername() + " " + intStudent.getSurname() +
                " " + intStudent.getCountry() );

        System.out.println("Teacher : " + teacher.getCourse() + " -> "+ teacher.getUsername()
                + " " + intStudent.getSchool() + " " + intStudent.getCountry() );

        Class classx = intStudent.getClass();
        while ( classx.getSuperclass() != null ){
            String daughterClass = classx.getName();
            String parentClass = classx.getSuperclass().getName();
            System.out.println(daughterClass + " -> It is a daughter class of the parent class -> " + parentClass);
            classx = classx.getSuperclass();
        }


    }
}

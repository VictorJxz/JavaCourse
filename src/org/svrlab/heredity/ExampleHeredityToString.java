package org.svrlab.heredity;

import org.svrlab.heredity.example.InternationalStudent;
import org.svrlab.heredity.example.Person;
import org.svrlab.heredity.example.Student;
import org.svrlab.heredity.example.Teacher;

public class ExampleHeredityToString {

    public static void main(String[] args) {

        System.out.println("#........           Created the instance student    ......" );
        Student student = new Student("@Student","Test Surname", 21, "Instituto Nacional");
        student.setNoteSpanish( 8.5 );
        student.setNoteMath( 7.3 );
        student.setNoteHistory( 8.9 );
        student.setEmail("virus@gmail.com");

        System.out.println("#........           Created the instance international student        ......" );
        InternationalStudent intStudent = new InternationalStudent("@Student1","Gosling","Australia");
        intStudent.setAge( 15 );
        intStudent.setSchool("Instituto Nacional");
        intStudent.setNoteLanguage(8.8);
        intStudent.setNoteSpanish( 8.9);
        intStudent.setNoteMath(9.5);
        intStudent.setNoteHistory( 9.5);
        intStudent.setEmail("virusmx@gmail.com");

        System.out.println("#........           Created the instance teacher       ......" );
        Teacher teacher = new Teacher("@Luci","@Perez","Math");
        teacher.setAge(37);
        teacher.setEmail("teacher@gmail.com");

        printInf( student );
        printInf( intStudent );
        printInf( teacher );

    }

    public static void printInf( Person person){
        System.out.println( person + "\n" );
    }
}

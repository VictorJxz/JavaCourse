package org.svrlab.heredity;

import org.svrlab.heredity.example.*;

public class ExampleHeredityConstructor {

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

        System.out.println("Username : " + person.getUsername() +
                "\nSurname : " + person.getSurname() +
                "\nAge : " + person.getAge() +
                "\nEmail : "+ person.getEmail() );

        if( person instanceof Student ){
            System.out.println("#.......        Student data        ......");
            System.out.println("School : "+ ((Student) person).getSchool());
            System.out.println("Note math : "+ ((Student) person).getNoteMath());
            System.out.println("Note History : "+ ((Student) person).getNoteHistory());
            System.out.println("Note Spanish : "+ ((Student) person).getNoteSpanish());

            if ( person instanceof InternationalStudent ){
                System.out.println("#......         International student data       .......");
                System.out.println("Note language : "+ ((InternationalStudent) person).getNoteLanguage());
                System.out.println("Country : "+ ((InternationalStudent) person).getCountry());
            }
            System.out.println("Average : "+ ((Student) person).calculateAverage());
        }

        if( person instanceof Teacher ){
            System.out.println("#........       Student teacher         ......");
            System.out.println("Course : "+((Teacher) person).getCourse());
        }
        System.out.println( person.greeting() );
        System.out.println();
    }
}

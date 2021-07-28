package org.svrlab.apicollection.list;

import org.svrlab.apicollection.model.Student;

import java.util.LinkedList;
import java.util.ListIterator;


public class ExampleLinkedList {

    public static void main(String[] args) {

        LinkedList<Student> linked = new LinkedList<>();
        System.out.println( linked + " size : " + linked.size() );
        System.out.println("Is Empty -> "+ linked.isEmpty());

        linked.add(new Student("Username", 5));
        linked.add(new Student("Username2", 6));
        linked.add( new Student("Username3", 4));
        linked.add(new Student("Username4", 7));
        linked.add(new Student("Username5", 3));

        System.out.println( linked + " size : " + linked.size() );
        linked.addFirst(new Student("Username8", 5));
        linked.addLast( new Student("Username01", 6));
        System.out.println( linked + " size : " + linked.size() );

        System.out.println("First -> "+ linked.peekFirst());
        System.out.println("Last -> "+linked.peekLast());
        System.out.println("Index  2 -> "+ linked.get(2));

        //Student student =  linked.pop();
        //linked.pollLast();
        linked.removeFirst();
        linked.removeLast();
        System.out.println( linked + " size : " + linked.size() );

        linked.remove(new Student("Username4", 7));
        System.out.println( linked + " size : " + linked.size() );

        Student student = new Student("Username10", 5);
        linked.add( student );
        System.out.println("Index Username10 -> "+ linked.indexOf( student ) );

        linked.remove(2);
        System.out.println( linked + " size : " + linked.size() );
        System.out.println("Index Username10 -> "+ linked.indexOf( student ) );

        linked.set(3, new Student("Username03", 7));
        System.out.println( linked + " size : " + linked.size() );

        ListIterator<Student> listIterator = linked.listIterator();

        while ( listIterator.hasNext()){
            Student student1 = listIterator.next();
            System.out.println( student1);
        }
        System.out.println("#...");

        while ( listIterator.hasPrevious() ){
            Student student1 = listIterator.previous();
            System.out.println( student1 );
        }


    }
}

package org.svrlab.apicollection.model;

import java.util.Objects;

public class Student implements  Comparable<Student> {

    private String username;
    private Integer note;

    public Student() {
    }

    public Student(String username, Integer note) {
        this.username = username;
        this.note = note;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return username + " note : " + note ;
    }

    @Override
    public int compareTo(Student a) {
        /*if (this.username == null){
            return 0;
        }
        return this.username.compareTo(a.username);*/
        /*if (this.note == a.note ) {
            return 0;
        }
        if (this.note > a.note) {
            return  1;
        }else  {
            return -1;
        }*/
        if ( this.note == null){
            return  0;
        }
        return  this.note.compareTo(a.note);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(username, student.username) && Objects.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, note);
    }
}

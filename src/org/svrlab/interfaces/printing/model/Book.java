package org.svrlab.interfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable {

    private List<Printable> pages;
    private Person author;
    private String title;
    private Gender gender;

    public Book(Person author, String title, Gender gender) {
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.pages = new ArrayList<>();
    }

    public Book addPage( Printable page){
        pages.add( page );
        return this;
    }

    @Override
    public String print(){
        StringBuilder sb = new StringBuilder("Title: ");
        sb.append(this.title).append("\n")
                .append("Author: ").append(this.author).append("\n")
                .append("Gender: ").append(this.gender).append("\n");
        for (Printable pag: this.pages){
            sb.append( pag.print() ).append("\n");
        }
        return sb.toString();
    }
}

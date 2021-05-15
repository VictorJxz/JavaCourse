package org.svrlab.interfaces.printing.model;

public class Report extends Leaf implements Printable{

    private Person author;
    private Person reviewer;


    public Report(Person author, Person reviewer, String contents) {
        super(contents);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Report written by: "+author +" reviewed by: "+ reviewer+"\n"+ this.contents +"\n";
    }


}

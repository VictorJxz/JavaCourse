package org.svrlab.design_patron.composite.example;

import org.svrlab.design_patron.composite.Directory;
import org.svrlab.design_patron.composite.File;

public class ExampleComposite {

    public static void main(String[] args) {

        Directory document = new Directory("Documents");
        Directory java = new Directory("Java");

        java.addComponent( new File("patron-composite.docx"));
        Directory stream = new Directory("Api Stream");
        stream.addComponent( new File("stream-map.docx"));

        java.addComponent( stream );
        document.addComponent( java );
        document.addComponent( new File("cv.docx"));
        document.addComponent( new File("logo.jpeg"));

        System.out.println( document.render(0) );
    }
}

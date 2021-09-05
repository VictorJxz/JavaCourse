package org.svrlab.file_management;

import org.svrlab.file_management.service.FileService;

public class ExampleCreateFile {


    public static void main(String[] args) {

        String fileName = "C:\\Users\\Vicktor\\Documents\\IdeaProjects\\JavaCourse\\src\\org\\svrlab\\file_management\\file\\Java.txt";
        FileService service = new FileService();

        service.createFile( fileName );
        service.createFilePrint( fileName );

    }
}

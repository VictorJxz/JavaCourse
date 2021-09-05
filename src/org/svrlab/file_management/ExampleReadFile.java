package org.svrlab.file_management;

import org.svrlab.file_management.service.FileService;

public class ExampleReadFile {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\Vicktor\\Documents\\IdeaProjects\\JavaCourse\\src\\org\\svrlab\\file_management\\file\\Java.txt";
        FileService service = new FileService();
        System.out.println( service.readerFile(fileName) );

        System.out.println( service.readerFileX( fileName ));
    }
}

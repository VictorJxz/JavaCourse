package org.svrlab.file_management.service;

import java.io.*;
import java.util.Scanner;

public class FileService {

    public void createFile( String name) {

        File file = new File( name );
        // Java 7
        try (BufferedWriter buffered = new BufferedWriter( new FileWriter( file, true ) )) {

            buffered.append("Hello world! \n")
                    .append("-> writing the file... ");
            System.out.println("File created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFilePrint( String name) {

        File file = new File( name );
        // Java 7
        try (PrintWriter buffered = new PrintWriter( new FileWriter( file, true ) )) {

            buffered.printf("# %s","PrintWriter");
            buffered.println("-> writing the file... ");
            System.out.println("File created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readerFile( String name ) {

        StringBuilder stringBuilder = new StringBuilder();
        File file = new File( name );
        try (BufferedReader reader = new BufferedReader( new FileReader( file ))){

            String line ;
            while ( (line = reader.readLine()) != null ) {
                stringBuilder.append( line ).append("\n");
            }

        } catch ( IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public String readerFileX( String name ) {

        StringBuilder stringBuilder = new StringBuilder();
        File file = new File( name );
        try (Scanner scanner = new Scanner( file )){

            scanner.useDelimiter("\n");
            while ( scanner.hasNext() ) {
                stringBuilder.append( scanner.next() ).append("\n");
            }

        } catch ( IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


}

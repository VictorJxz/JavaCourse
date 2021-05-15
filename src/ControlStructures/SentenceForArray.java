package ControlStructures;

import javax.swing.*;
import java.util.Locale;

public class SentenceForArray {

    public static void main(String[] args) {

        String[] names = {"@Qubit", "Test", "Test1", "Test2"};
        int count = names.length;

        for(int i =0; i < count; i++ ){
            if( names[i].toLowerCase().contains("test") ){
                continue;
            }
            System.out.println(i +" " +names[i]);
        }

        String search = JOptionPane.showInputDialog(" Search... \" #Qubit\" ");
        System.out.println("search = " + search);

        boolean found = false;
        for(int i=0; i < count; i++){
            if( names[i].equalsIgnoreCase( search )){
                found = true;
                break;
            }
        }
        if( found ){
            JOptionPane.showMessageDialog(null,search+" Data searched");
        } else {
            JOptionPane.showMessageDialog(null, "Does not exist in the system");
        }

    }
}

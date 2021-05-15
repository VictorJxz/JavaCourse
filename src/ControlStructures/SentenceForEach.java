package ControlStructures;

public class SentenceForEach {

    public static void main(String[] args) {

        int[] array = {1,3,5,7,9,11,13,14};
        for( int number: array){
            System.out.println("number = " + number);
        }

        String[] names = {"@Qubit", "Test", "Test1", "Test2"};
        for(String item: names){
            System.out.println("item = " + item);
        }
    }
}

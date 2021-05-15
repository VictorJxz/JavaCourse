package ControlStructures;

public class SentenceIfElse {

    public static void main(String[] args){

        float ratings = 8.8f;

        if( ratings >= 9.0 ){
            System.out.println("Excellent good job! ");
        } else if ( ratings >= 8.0){
            System.out.println("Regulate you can do better! ");
        } else if ( ratings >= 7.0  ){
            System.out.println("You need to reinforce the knowledge! ");
        } else {
            System.out.println("Rejected!");
        }

        System.out.println("ratings = " + ratings);
    }

}

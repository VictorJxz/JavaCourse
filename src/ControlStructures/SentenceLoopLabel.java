package ControlStructures;

public class SentenceLoopLabel {

    public static void main(String[] args) {

        System.out.println("...............    Loop #1   ........................");
        loop: for(int i = 1; i <= 7; i++){
            System.out.println();
            int j = 1;
            while ( j <= 8 ){
                if(i == 6 || i == 7){
                    System.out.println("Day "+i+" weekend break!");
                    continue loop;
                }
                System.out.println("Day " + i +" working at "+ j+" hrs");
                j++;
            }
        }

        System.out.println("...............    Loop #2   ........................");
        loop1: for(int i = 0; i < 5; i++){
            System.out.println();
            for( int j = 0; j < 5; j++){
                if(i == 2){
                    continue loop1;
                }
                System.out.println("[ i = " + i + " , j = " + j+" ]");
            }
        }

        System.out.println("...............   Loop #3   .......................");
        label1:  for(int i = 0; i < 5; i++){
            System.out.println();
            for( int j = 0; j < 5; j++){
                if(i == 2){
                    break label1;
                }
                System.out.println("i = " + i + " , j = " + j);
            }
        }

    }
}

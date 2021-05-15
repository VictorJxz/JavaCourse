package ControlStructures;

public class SentenceLoopLabelSearch {

    public static void main(String[] args) {

        String sentence =  "Advanced Encryption Standard (AES), standard also known as Rijndael (pronounced \"Rain Doll\" in English), is a yy" ;
        String word = "Standard";

        int maxWord = word.length();
        int maxSentence = sentence.length() - maxWord;

        int quantity = 0;
        char character = 'y';

        search: for( int i = 0; i <= maxSentence; ){
            int k = i;
            for( int j = 0; j < maxWord; j++) {
                if( sentence.toLowerCase().charAt(k++) != word.toLowerCase().charAt(j)){
                    i++;
                    continue search;
                }
            }
            quantity++;
            i = i + quantity;
        }
        System.out.println("Found... "+quantity+" the word [ "+word+" ]");
        quantity = 0;

        for( int i = 0; i < sentence.length(); i++ ){
            if( sentence.charAt(i) != character){
                continue;
            }
            quantity++;
        }
        System.out.println("Found... "+quantity+" the character [ "+character+" ]");

    }
}

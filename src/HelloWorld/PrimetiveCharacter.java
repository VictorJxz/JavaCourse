package HelloWorld;

public class PrimetiveCharacter {

    public static void main(String[] args) {

        var character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == character: "+ (decimal == character));

        char symbol = '@';
        System.out.println("Symbol : "+symbol);
        System.out.println("Symbol == character: "+ (symbol == character));

        System.out.println("Char type correspond in byte to \n"+ Character.BYTES);
        System.out.println("Char type correspond in bytes to "+System.lineSeparator()+ Character.SIZE);
        System.out.println("Maximum value of a char "+ Character.MAX_VALUE);
        System.out.println("Minimum value of a char "+ Character.MIN_VALUE);
    }
}

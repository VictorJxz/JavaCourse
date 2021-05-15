package MathClass;

import java.util.Random;

public class ExampleRandom {

    public static void main(String[] args) {

        String[] color = {"Blue","Yellow", "Red", "Green","White", "Black"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= color.length;


        System.out.println("random = " + random);
        random = Math.floor( random );
        System.out.println("random = " + random);

        System.out.println("color = " + color[ (int)random ]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt( color.length );
        System.out.println("randomInt = " + randomInt);
        System.out.println("color = " + color[ randomInt ]);

        
    }
}

package POO;

import java.util.Date;

public class ExampleCar {

    public static void main(String[] args) {

        //# ..........       Polymorphism        .............
        // different ways to create the object

        Engine engineCar = new Engine( 2.0, TypeEngine.BENCINA );
        Car car = new Car("TEST-MAKER", "TEST-MODEL");
        car.setEngine( engineCar );
        car.setTank( new Tank());
        car.setColor( Color.WHITE );

        Date date = new Date();

        Engine engineJeep = new Engine(3.0, TypeEngine.DIESEL);
        Car jeep = new Car("Jeep","TEST-50", Color.RED , engineJeep );
        jeep.setTank( new Tank(45));
        Car nissan2 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY ,
                new Engine(4.0, TypeEngine.DIESEL) , new Tank(50));
        Car nissan3 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY ,
                new Engine(3.5, TypeEngine.BENCINA) , new Tank(50));
        Car carTest = new Car();

        System.out.println("jeep.getMaker() = " + jeep.getMaker());
        System.out.println("They are equals -> " + ( nissan2 == nissan3 ) );
        System.out.println("They are equals con equals -> " + ( nissan2.equals( nissan3 )) );

        System.out.println( carTest.equals( carTest ));
        System.out.println( car.equals( date ));

        System.out.println( car.detail() );
        System.out.println( jeep.detail() );

        System.out.println( nissan2 );
        System.out.println( nissan2.toString() );

        System.out.println( jeep.speedUp( 3000));
        System.out.println( jeep.brake() );

        System.out.println( car.speedUpBrake( 4000 ));

        //#......       Encapsulation principle          .........
        // Permanent implementation details "hidden" from the people who use the classes,
        // thus preventing modifications or improper access to the data that the classes store.
        System.out.println("\nKm for liters "+jeep.calculateConsumption(300,0.6f));
        System.out.println("Km for liters "+jeep.calculateConsumption(300,60));
    }
}

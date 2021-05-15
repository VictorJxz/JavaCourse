package POO;

public class ExampleCarRelation {

    public static void main(String[] args) {


        Person personCar = new Person("@Virus", "Surname1");

        Car car = new Car("TEST-MAKER", "TEST-MODEL");
        car.setEngine(new Engine( 2.0, TypeEngine.BENCINA ));
        car.setTank( new Tank());
        Car.setTankCapacityStatic(45);
        car.setColor( Color.WHITE );
        car.setTypeCarII( TypeCarII.HATCHBACK );
        car.setPerson( personCar );
        //car.setWheels( wheelsCar );
        Wheel[] wheelsCar = new Wheel[10];
        for (int i = 0; i < wheelsCar.length; i++){
            car.addWheel( new Wheel("Yokohama", 16, 7.5));
        }

        Wheel[] wheelsJeep = new Wheel[5];
        for (int i = 0; i < wheelsJeep.length; i++){
            wheelsJeep[ i ] = new Wheel("Michelin", 18, 10.5);
        }

        Person personJeep = new Person("@Qubit", "Surname2");
        Car jeep = new Car("Jeep","TEST-50", Color.RED , new Engine(3.0, TypeEngine.DIESEL) );
        jeep.setTypeCarII( TypeCarII.PICKUP );
        jeep.setPerson( personJeep );
        jeep.setWheels( wheelsJeep );


        Person personNissan2 = new Person( "@SvrLab", "Surname3");
        Car nissan2 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY,
                new Engine(4.0, TypeEngine.DIESEL)  , new Tank(50));
        nissan2.setTypeCarII( TypeCarII.PICKUP );
        nissan2.setPerson( personNissan2 );

        //#.....             Chained methods            ........
        nissan2.addWheel(new Wheel("Pirelli", 20,11.5))
                .addWheel(new Wheel("Pirelli", 20,11.5))
                .addWheel(new Wheel("Pirelli", 20,11.5))
                .addWheel(new Wheel("Pirelli", 20,11.5))
                .addWheel(new Wheel("Pirelli", 20,11.5));


        Wheel[] wheelsNissan3 = new Wheel[5];
        for ( int i = 0; i < wheelsNissan3.length; i++){
            wheelsNissan3[ i ] = new Wheel("Pirelli", 20,11.5);
        }

        Person personNissan3 = new Person( "@HdrLab", "Surname4");
        Car nissan3 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY,
                new Engine(3.5, TypeEngine.BENCINA) , new Tank(50), personNissan3, wheelsNissan3);
        nissan3.setTypeCarII( TypeCarII.PICKUP );


        Car.setColorPatent( Color.ORANGE );

        System.out.println( car.detail() );
        System.out.println( jeep.detail() );
        System.out.println( nissan2.detail() );
        System.out.println( nissan3.detail() );


    }
}

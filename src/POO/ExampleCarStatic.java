package POO;

public class ExampleCarStatic {

    public static void main(String[] args) {

        //# ..........       Polymorphism        .............
        // different ways to create the object
        Car car = new Car("TEST-MAKER", "TEST-MODEL");
        car.setEngine(new Engine( 2.0, TypeEngine.BENCINA ));
        car.setTank( new Tank());
        Car.setTankCapacityStatic(45);
        car.setColor( Color.WHITE );
        car.setTypeCarII( TypeCarII.HATCHBACK );

        System.out.println( "ROAD SPEED MAX : " + Car.ROAD_SPEED_MAX);
        System.out.println( "CITY SPEED MAX : " + Car.CITY_SPEED_MAX);

        Car jeep = new Car("Jeep","TEST-50", Color.RED , new Engine(3.0, TypeEngine.DIESEL) );
        //jeep.setTank( new Tank());

        Car nissan2 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY,
                new Engine(4.0, TypeEngine.DIESEL)  , new Tank(50));
        Car nissan3 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY,
                new Engine(3.5, TypeEngine.BENCINA) , new Tank(50));

        jeep.setTypeCarII( TypeCarII.PICKUP );
        nissan2.setTypeCarII( TypeCarII.PICKUP );
        nissan3.setTypeCarII( TypeCarII.PICKUP );
        Car.setColorPatent( Color.ORANGE );

        System.out.println( car.detail() );
        System.out.println( jeep.detail() );
        System.out.println("Car.getColorPatent() : " + Car.getColorPatent());
        System.out.println("km for liters : " + Car.calculateConsumptionStatic(300, 60));

        System.out.println("#..................................");
        TypeCarII typeCarII = jeep.getTypeCarII();
        System.out.println("Type jeep : " + typeCarII.getName());
        System.out.println("Type description jeep : " +  typeCarII.getDescription());

        System.out.println( jeep.calculateConsumption( 300, 70));

    }
}

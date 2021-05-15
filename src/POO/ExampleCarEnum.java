package POO;

public class ExampleCarEnum {

    public static void main(String[] args) {

        //# ..........       Polymorphism        .............
        // different ways to create the object
        Car car = new Car("TEST-MAKER", "TEST-MODEL");
        car.setEngine(new Engine( 2.0, TypeEngine.BENCINA ));
        Car.setTankCapacityStatic(45);
        car.setColor( Color.WHITE );
        car.setTank( new Tank());
        car.setTypeCarII( TypeCarII.HATCHBACK );

        Car jeep = new Car("Jeep","TEST-50", Color.RED , new Engine(3.0, TypeEngine.DIESEL));
        jeep.setTypeCarII( TypeCarII.PICKUP );
        jeep.setTank( new Tank(45));


        System.out.println("#..................................");
        TypeCarII typeJeep = jeep.getTypeCarII();
        System.out.println("Type jeep : " + typeJeep.getName());
        System.out.println("Type description jeep : " +  typeJeep.getDescription());

        switch(  typeJeep ){
            case CONVERTIBLE ->
                System.out.println("> The car is sporty and two door convertible");
            case COUPE ->
                System.out.println("> It is a small car with two doors and typically sports");
            case FURGON ->
                System.out.println("> It is a utility car of transport, of company");
            case HATCHBACK ->
                System.out.println("> It's a compact midsize car, sport looking");
            case PICKUP ->
                System.out.println("> It is a double cab or pickup car");
            case SEDAN ->
                System.out.println("> It's a midsize car");
            case STATION_WAGON ->
                System.out.println("> It's a bigger car, with a big suitcase");
        }

        System.out.println("#..................................");
        TypeCarII[] types = TypeCarII.values();
        for ( TypeCarII item : types ){
            System.out.println( item + " -> " + item.name() + " : " + item.getName() + " : " +
                    item.getName() + " : " + item.getNumberDoors());
        }

    }
}

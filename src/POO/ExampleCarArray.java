package POO;

import java.util.Arrays;

public class ExampleCarArray {

    public static void main(String[] args) {

        Person personCar = new Person("@Virus", "Surname1");

        Car car = new Car("TEST-MAKER", "TEST-MODEL");
        car.setEngine(new Engine( 2.0, TypeEngine.BENCINA ));
        car.setTank( new Tank());
        Car.setTankCapacityStatic(45);
        car.setColor( Color.WHITE );
        car.setTypeCarII( TypeCarII.HATCHBACK );
        car.setPerson( personCar );

        Person personJeep = new Person("@Qubit", "Surname2");
        Car jeep = new Car("Jeep","TEST-50", Color.RED , new Engine(3.0, TypeEngine.DIESEL) );
        jeep.setTypeCarII( TypeCarII.PICKUP );
        jeep.setPerson( personJeep );

        Person personNissan2 = new Person( "@SvrLab", "Surname3");
        Car suzuki = new Car("Suzuki","Vitara", Color.DARK_GRAY,
                new Engine(1.6, TypeEngine.BENCINA)  , new Tank(50));
        suzuki.setTypeCarII( TypeCarII.SUV );
        suzuki.setPerson( personNissan2 );


        Person personNissan3 = new Person( "@HdrLab", "Surname4");
        Car nissan3 = new Car("NISSAN2","TEST-50", Color.DARK_GRAY,
                new Engine(3.5, TypeEngine.BENCINA) , new Tank(50));
        nissan3.setPerson( personNissan3 );
        nissan3.setTypeCarII( TypeCarII.PICKUP );
        Car.setColorPatent( Color.ORANGE );

        Car audi = new Car("Audi", "A3");
        audi.setPerson( new Person("Jano", "Perez"));

        Car[]  cars = new Car[5];
        cars[0] = car;
        cars[1] = jeep;
        cars[2] = suzuki;
        cars[3] = nissan3;
        cars[4] = audi;

        Arrays.sort( cars );
        for (Car value : cars) {
            System.out.println(value);
        }



    }
}

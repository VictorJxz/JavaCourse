package org.svrlab.genericsclass;

public class ExampleGenerics {

    public static void main(String[] args) {

        Truck<Animal> truckHorses = new Truck<>(5);
        truckHorses.add( new Animal("Profeta","Horse"));
        truckHorses.add( new Animal("Rojo","Horse"));
        truckHorses.add( new Animal("Tunquen","Horse"));
        truckHorses.add( new Animal("Dorado","Horse"));
        truckHorses.add( new Animal("Torino","Horse"));

        toPrint( truckHorses );

        Truck<Machinery> truckMachines = new Truck<>( 3);
        truckMachines.add( new Machinery("Bulldozer"));
        truckMachines.add( new Machinery("Crane Horquilla"));
        truckMachines.add( new Machinery("Punching machine"));

        System.out.println();
        toPrint( truckMachines );

        Truck<Car> truckCar = new Truck<>( 3);
        truckCar.add(new Car("Toyota"));
        truckCar.add(new Car("Mitsubishi"));
        truckCar.add(new Car("Chevrolet"));

        System.out.println();
        toPrint( truckCar );
    }

    public static <T> void toPrint( Truck<T> truck){
        for ( T t: truck){
            if ( t instanceof Animal ){
                System.out.println( ((Animal)t).getName()+" type: "+ ((Animal)t).getType() );
            }
            else if ( t instanceof  Machinery){
                System.out.println( ((Machinery)t).getType() );
            }
            else if ( t instanceof  Car){
                System.out.println( ((Car)t).getBrand() );
            }
        }
    }
}

package POO;

public enum TypeCarII {

    SEDAN("Sedan","Normal car",4),
    STATION_WAGON("Station wagon","Big car",5),
    HATCHBACK("Hatchback","Compat car",5),
    PICKUP("Pickup","Pickup truck",4),
    COUPE("Coupe","Small car",2),
    CONVERTIBLE("Convertible","Sport car",2),
    FURGON("Furgon","Utility car",3),
    SUV("SUV", "sports all terrain",5);

    private final String name;
    private final int numberDoors;
    private final String description;

    TypeCarII(String name, String description, int numberDoors) {
        this.name = name;
        this.numberDoors = numberDoors;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public String getDescription() {
        return description;
    }
}

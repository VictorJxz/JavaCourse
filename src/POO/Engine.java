package POO;

public class Engine {

    private double displacement;
    private TypeEngine typeEngine;


    public Engine(double displacement, TypeEngine typeEngine) {
        this.displacement = displacement;
        this.typeEngine = typeEngine;
    }

    public double getDisplacement() {
        return displacement;
    }

    public TypeEngine getTypeEngine() {
        return typeEngine;
    }

}

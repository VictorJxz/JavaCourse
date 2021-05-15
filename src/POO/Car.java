package POO;

public class Car implements Comparable<Car>{

    private int id;
    private String maker;
    private String model;
    private Color color = Color.GRAY;
    private Engine engine;
    private Tank tank ;

    private TypeCarII typeCarII;

    // #....................   Object relation  ...................
    private Person person;
    private Wheel[] wheels;
    private int indexWheel;


    private static Color colorPatent = Color.ORANGE;
    private static int tankCapacityStatic = 30;
    private static int lastId;
    public static final Integer ROAD_SPEED_MAX = 120;
    public static final int CITY_SPEED_MAX = 60;

    public static final String COLOR_RED = "RED";
    public static final String COLOR_DARK_GRAY = "DARK GRAY";
    public static final String COLOR_GRAY = "GRAY";
    public static final String COLOR_WHITE = "WHITE";


    //#.......      Constructor overload        ..........
    public Car(){
        this.id = ++lastId;
        this.wheels = new Wheel[5];
    }
    public Car(String maker, String model ) {
        this();
        this.maker = maker;
        this.model = model;
    }
    public Car(String maker, String model, Color color) {
        this(maker, model);
        this.color = color;
    }
    public Car(String maker, String model, Color color, Engine engine) {
        this( maker, model, color);
        this.engine = engine;
    }

    public Car(String maker, String model, Color color, Engine engine, Tank tank) {
        this( maker, model, color, engine);
        this.tank = tank;
    }

    public Car(String maker, String model, Color color, Engine engine, Tank tank, Person person, Wheel[] wheels) {
        this(maker, model, color, engine, tank);
        this.person = person;
        this.wheels = wheels;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public static void setColorPatent(Color colorPatent) {
        Car.colorPatent = colorPatent;
    }
    public static int getTankCapacityStatic() {
        return tankCapacityStatic;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public TypeCarII getTypeCarII() {
        return typeCarII;
    }
    public void setTypeCarII(TypeCarII typeCarII) {
        this.typeCarII = typeCarII;
    }

    public static void setTankCapacityStatic(int tankCapacityStatic) {
        Car.tankCapacityStatic = tankCapacityStatic;
    }

    public String getMaker() {
        return  this.maker;
    }
    public String getModel() {
        return this.model;
    }
    public Color getColor() {
        return this.color;
    }

    public static Color getColorPatent() {
        return colorPatent;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        if ( tank == null){
            this.tank = new Tank();
        }
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Car addWheel( Wheel wheel ){
        if ( indexWheel < this.wheels.length ){
            this.wheels[ indexWheel++ ] = wheel;
        }
        return this;
    }

    public String detail(){
        String detail = "#...................................." +
                "\nCar ID -> " + this.id +
                "\nMaker : " + this.getMaker() +
                "\nModel : " + this.getModel();

        if ( this.getTypeCarII() != null ){
            detail += "\n Type car ->  " + this.getTypeCarII().getDescription();
        }
                detail += "\nColor patent : " + colorPatent.getColor() +
                "\nColor : " + this.color;
        if ( this.engine != null ){
            detail += "\nCylinders : " + engine.getDisplacement() ;
        }

        if ( person != null ) {
            detail += "\n# Car driver : "+ this.getPerson();
        }

        if ( getWheels() != null ){
            detail += "\n Car wheels : ";
            for ( Wheel w : this.getWheels() ){
                detail += "\n"+ w.getMaker() + ", ring : " + w.getRing() + ", broad : " + w.getBroad();
            }
        }

        return detail;
    }

    public String speedUp( int rpm){
        return "--\n" +"The car "+maker+" accelerates to "+rpm+"rpm";
    }

    public String brake(){
        return this.maker+" "+this.model+" braking !";
    }

    public String speedUpBrake( int rpm ){

        String speedUp = this.speedUp( rpm );
        String brake = this.brake();
        return  speedUp+"\n"+brake;
    }

    //#......        Polymorphism principle         .........
    // Polymorphism is the ability of the objects of a class to offer a different and
    // independent response according to the parameters (different implementations).
    public float calculateConsumption( int km, float benzinePercentage ){
        return km/( this.getTank().getCapacity() * benzinePercentage  );
    }

    public float calculateConsumption( int km, int benzinePercentage ){
        return km/( this.getTank().getCapacity() * (benzinePercentage/100f) );
    }

    public static float calculateConsumptionStatic( int km, int benzinePercentage ){
        return km/( Car.tankCapacityStatic *(benzinePercentage/100f) );
    }


    //#.......          Overwrite method            ........
    @Override
    public boolean equals(Object obj) {

        if ( this == obj ){ return true; }
        if ( !(obj instanceof Car)) { return false; }

        Car a = ( Car )obj;
        return (this.maker != null && this.model != null
                && this.maker.equals( a.getMaker()) && this.model.equals( a.getModel()));
    }

    @Override
    public String toString() {
        return this.id + " : " + maker + " " + model;
    }

    @Override
    public int compareTo(Car a) {
        return this.maker.compareTo( a.maker );
    }
}

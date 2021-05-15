package POO;

public class Wheel {

    private String maker;
    private int ring;
    private double broad;

    public Wheel(String maker, int ring, double broad) {
        this.maker = maker;
        this.ring = ring;
        this.broad = broad;
    }

    public String getMaker() {
        return maker;
    }

    public int getRing() {
        return ring;
    }

    public double getBroad() {
        return broad;
    }
}

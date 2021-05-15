package POO;

public enum Color {
    RED("RED"),
    YELLOW("YELLOW"),
    BLUE("BLUE"),
    WHITE("WHITE"),
    GRAY("GRAY"),
    DARK_GRAY("DARK_GRAY"),
    ORANGE("Orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}

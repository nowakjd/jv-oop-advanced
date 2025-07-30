package core.basesyntax;

public class Rectangle extends Figure{
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    String[] getProperties() {
        return new String[]{
                "width: " + width + " units",
                "height: " + height + " units"
        };
    }
}

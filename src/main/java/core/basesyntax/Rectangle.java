package core.basesyntax;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
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

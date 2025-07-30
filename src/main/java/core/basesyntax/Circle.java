package core.basesyntax;

public class Circle extends Figure{
    private final double radius;
    public Circle( String color, double radius) {
        super("Circle", color);
        this.radius=radius;
    }

    @Override
    double getArea() {
        return radius * Math.PI * 0.5;
    }

    @Override
    String[] getProperties() {
        return new String[] {"radius: " + radius + " units"};
    }
}

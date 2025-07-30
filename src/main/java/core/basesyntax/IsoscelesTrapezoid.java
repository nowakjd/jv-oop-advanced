package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super("Isosceles Trapezoid", color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    double getArea() {
        return (firstBase + secondBase) * height * 0.5;
    }

    @Override
    String[] getProperties() {
        return new String[]{
                "first base: " + firstBase + " units",
                "second base: " + secondBase + " units",
                "height: " + height + " units"
        };
    }
}

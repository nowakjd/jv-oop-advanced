package core.basesyntax;

public class RightTriangle extends Figure{
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle( String color, double firstLeg, double secondLeg) {
        super(" Right triangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    String[] getProperties() {
        return new String[]{
                "first leg: " + firstLeg + " units",
                "second leg: " + secondLeg + " units"
        };
    }
}

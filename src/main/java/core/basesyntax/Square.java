package core.basesyntax;

public class Square extends Figure{
    double side;

    public Square( String color, double side) {
        super("Square", color);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    String[] getProperties() {
        return new String[] {"side: " + side + " units"};
    }
}

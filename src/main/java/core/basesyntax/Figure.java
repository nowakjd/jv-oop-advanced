package core.basesyntax;

public abstract class Figure implements Drawable, Calculable_Area {
    String figureType;
    String color;
    Figure(String figureType, String color) {
        this.figureType = figureType;
        this.color = color;
    }

    abstract String[] getProperties();
    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(figureType).append(", ")
                .append("area: ")
                .append(getArea())
                .append(" square units, ");
        for (String property:getProperties()) {
            stringBuilder.append(property).append(" ");
        }
        stringBuilder.append("color: ").append(color);
        System.out.println(stringBuilder.toString());
    }
}

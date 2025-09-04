package lesson22.factory;

import lesson22.factory.shapes.Hexagon;
import lesson22.factory.shapes.Line;
import lesson22.factory.shapes.Square;
import lesson22.factory.shapes.Star;

public class Factory {

    private Color color = Color.BLACK;
    private int pxLine = 2;
    private int angleCount = 5;

    public static final Factory factory = new Factory();

    public static Factory getInstance() {
        return factory;
    }

    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case LINE -> new Line(color, pxLine);
            case STAR -> new Star(color, pxLine, angleCount);
            case SQUARE -> new Square(color, pxLine);
            case HEXAGON -> new Hexagon(color, pxLine);
            default -> throw new RuntimeException("Unknown shape");
        };
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPxLine() {
        return pxLine;
    }

    public void setPxLine(int pxLine) {
        this.pxLine = pxLine;
    }
}

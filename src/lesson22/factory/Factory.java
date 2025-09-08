package lesson22.factory;

import lesson22.factory.shapes.Arrow;
import lesson22.factory.shapes.Hexagon;
import lesson22.factory.shapes.Line;
import lesson22.factory.shapes.Square;
import lesson22.factory.shapes.Star;

import java.util.HashMap;
import java.util.Map;

import static lesson22.factory.ShapeType.LINE;

public class Factory {

    private Color color = Color.BLACK;
    private int pxLine = 2;
    private int angleCount = 5;

    private int count;
    private Map<ShapeType, Integer> mapCount = new HashMap<>();

    public static final Factory factory = new Factory();

    public static Factory getInstance() {
        return factory;
    }

    public Shape getShape(ShapeType shapeType) {
        if (count > 50) {
            return null;
        }
        count++;
        return switch (shapeType) {
            case LINE -> {
                mapCount.put(LINE, mapCount.getOrDefault(LINE, 0) + 1);
                yield new Line(color, pxLine);
            }
            case STAR -> new Star(color, pxLine, angleCount);
            case SQUARE -> new Square(color, pxLine);
            case HEXAGON -> new Hexagon(color, pxLine);
            case ARROW -> new Arrow(color, pxLine);
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

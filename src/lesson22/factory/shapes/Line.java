package lesson22.factory.shapes;

import lesson22.factory.AbstractShape;
import lesson22.factory.Color;
import lesson22.factory.Shape;

public class Line extends AbstractShape {

    public Line(Color color, int pxLine) {
        super(color, pxLine);
    }

    @Override
    public void draw() {
        System.out.printf("%10s --- %5s --- %3s\n", Line.class.getSimpleName(),getColor(), getPxLine());
    }
}

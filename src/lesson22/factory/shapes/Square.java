package lesson22.factory.shapes;

import lesson22.factory.AbstractShape;
import lesson22.factory.Color;
import lesson22.factory.Shape;

public class Square extends AbstractShape {

    public Square(Color color, int pxLine) {
        super(color, pxLine);
    }

    @Override
    public void draw() {
        System.out.printf("%10s --- %5s --- %3s\n", Square.class.getSimpleName(),getColor(), getPxLine());
    }
}

package lesson22.factory.shapes;

import lesson22.factory.AbstractShape;
import lesson22.factory.Color;
import lesson22.factory.Shape;

public class Hexagon extends AbstractShape {

    public Hexagon(Color color, int pxLine) {
        super(color, pxLine);
    }

    @Override
    public void draw() {
        getColor();
        getPxLine();
        //

        System.out.printf("%10s --- %5s --- %3s\n", Hexagon.class.getSimpleName(),getColor(), getPxLine());
    }
}

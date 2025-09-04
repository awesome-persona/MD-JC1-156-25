package lesson22.factory.shapes;

import lesson22.factory.AbstractShape;
import lesson22.factory.Color;
import lesson22.factory.Shape;

public class Star extends AbstractShape {

    private int angleCount;

    public Star(Color color, int pxLine, int angleCount) {
        super(color, pxLine);
        this.angleCount = angleCount;
    }

    @Override
    public void draw() {
        System.out.printf("%10s --- %5s --- %3s --- %3s\n", Star.class.getSimpleName(),getColor(), getPxLine(), angleCount);
    }
}

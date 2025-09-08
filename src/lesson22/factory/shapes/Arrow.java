package lesson22.factory.shapes;

import lesson22.factory.AbstractShape;
import lesson22.factory.Color;

public class Arrow extends AbstractShape  {

    public Arrow(Color color, int pxLine) {
        super(color, pxLine);
    }

    @Override
    public void draw() {
        System.out.printf("%10s --- %5s --- %3s\n", Arrow.class.getSimpleName(),getColor(), getPxLine());
    }
}

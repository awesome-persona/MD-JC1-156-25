package lesson22;

import lesson22.factory.Color;
import lesson22.factory.Factory;
import lesson22.factory.Shape;
import lesson22.factory.ShapeType;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Factory factory = Factory.getInstance();

        Shape shape1 = factory.getShape(ShapeType.HEXAGON);
        Shape shape2 = factory.getShape(ShapeType.LINE);

        factory.setColor(Color.BLUE);
        factory.setPxLine(5);
        Shape shape3 = factory.getShape(ShapeType.STAR);
        shape3.setPxLine(3);
        Shape shape4 = factory.getShape(ShapeType.SQUARE);
        factory.setColor(Color.RED);
        factory.setPxLine(1);

        Shape shape5 = factory.getShape(ShapeType.LINE);
        Shape shape6 = factory.getShape(ShapeType.SQUARE);


        List.of(shape1, shape2, shape3, shape4, shape5, shape6)
                .forEach(Shape::draw);
    }

}

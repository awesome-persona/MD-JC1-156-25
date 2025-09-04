package lesson22.factory;

public interface Shape {

    void draw();

    Color getColor();

    int getPxLine();

    void setColor(Color color);

    void setPxLine(int pxLine);
}

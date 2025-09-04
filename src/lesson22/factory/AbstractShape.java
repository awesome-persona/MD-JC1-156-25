package lesson22.factory;

public abstract class AbstractShape implements Shape {

    private Color color;
    private int pxLine;

    public AbstractShape(Color color, int pxLine) {
        this.color = color;
        this.pxLine = pxLine;
    }

    public Color getColor() {
        return color;
    }

    public int getPxLine() {
        return pxLine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPxLine(int pxLine) {
        this.pxLine = pxLine;
    }



}

package lesson09.animals;

public class Crow extends FlyingAnimal {

    private String color;

    public Crow(String name, double weight, int age, boolean hasFeathers, String color) {
        super(name, weight, age, hasFeathers);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("karrr");
    }
}

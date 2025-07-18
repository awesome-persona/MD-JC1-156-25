package lesson09.animals;

public class Cow extends EarthAnimal {

    private int stomachCount;

    public Cow(String name, double weight, int age, int legsCount, int stomachCount) {
        super(name, weight, age, legsCount);
        this.stomachCount = stomachCount;
    }

    public int getStomachCount() {
        return stomachCount;
    }

    @Override
    public void voice() {
        System.out.println("Myyyyyy");
    }
}

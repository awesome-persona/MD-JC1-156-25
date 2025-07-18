package lesson09.animals;

public class Shark extends WaterAnimal {

    private int teethCount;

    public Shark(String name, double weight, int age, boolean hasScales, int teethCount) {
        super(name, weight, age, hasScales);
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return teethCount;
    }

    @Override
    public void swim() {
        System.out.println("I need to swim every minute");
    }

    @Override
    public void voice() {
        System.out.println("bubble");
    }
}

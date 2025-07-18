package lesson09.animals;

public abstract class WaterAnimal extends Animal {

    boolean hasScales;

    public WaterAnimal(String name, double weight, int age, boolean hasScales) {
        super(name, weight, age);
        this.hasScales = hasScales;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public abstract void swim();
}

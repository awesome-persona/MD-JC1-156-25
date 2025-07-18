package lesson09.animals;

public abstract class FlyingAnimal extends Animal {

    private boolean hasFeathers;

    public FlyingAnimal(String name, double weight, int age, boolean hasFeathers) {
        super(name, weight, age);
        this.hasFeathers = hasFeathers;
    }

    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public void fly() {
        System.out.println("I believe I can fly");
    }
}

package lesson09.animals;

public class Parrot extends FlyingAnimal {

    private boolean canRepeat;

    public Parrot(String name, double weight, int age, boolean hasFeathers, boolean canRepeat) {
        super(name, weight, age, hasFeathers);
        this.canRepeat = canRepeat;
    }

    public boolean isCanRepeat() {
        return canRepeat;
    }

    @Override
    public void voice() {
        System.out.println("hello world");
    }
}

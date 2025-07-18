package lesson09.animals;

public abstract class EarthAnimal extends Animal {

    private int legsCount;


    public EarthAnimal(String name, double weight, int age, int legsCount) {
        super(name, weight, age);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void move() {
        System.out.print("I can run! ");
        super.move();
    }
}

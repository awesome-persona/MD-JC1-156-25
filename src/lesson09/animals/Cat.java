package lesson09.animals;

public class Cat extends EarthAnimal {

    private int livesCount;

    public Cat(String name, double weight, int age, int legsCount, int livesCount) {
        super(name, weight, age, legsCount);
        this.livesCount = livesCount;
    }

    public int getLivesCount() {
        return livesCount;
    }

    @Override
    public void voice() {
        System.out.println("Meow meow meow");
    }

    public void jump() {
        System.out.println("It's so fast to jump through the river");
    }
}

package lesson09.animals;

public class Human extends EarthAnimal implements Humanitarian {

    public Human(String name, double weight, int age, int legsCount) {
        super(name, weight, age, legsCount);
    }

    @Override
    public void voice() {
        System.out.println("How are you doing? My name " + getName());
    }

    @Override
    public void develop() {
        System.out.println("I'm so smart");
    }

    @Override
    public void think() {
        System.out.println("I'm lazy");
    }

    @Override
    public void fight() {
        System.out.println("I want all world");
    }
}

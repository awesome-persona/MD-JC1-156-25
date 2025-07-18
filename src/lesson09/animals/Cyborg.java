package lesson09.animals;

public class Cyborg implements Humanitarian {

    private String model;
    private double weight;

    public Cyborg(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("I have wheels");
    }

    @Override
    public void voice() {
        System.out.println("I need your clothes");
    }

    public void charge() {
        System.out.println("init 15%");
    }

    @Override
    public void develop() {
        System.out.println("I do my best");
    }

    @Override
    public void think() {
        System.out.println("Ask chatGPT");
    }

    @Override
    public void fight() {
        System.out.println("Who will fight?");
    }
}

package lesson09.animals;

public abstract class Animal {

    private String name;
    private double weight;
    private int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println("keep moving");
    }

    public abstract void voice();

    public void sleep() {
        System.out.println("ZzzZzzzZZzzzz");
    }
}

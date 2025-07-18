package lesson09.animals;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("", 3.3, 22);

        Parrot gosha = new Parrot("Gosha", 0.3, 3, true, true);
        Parrot kesha = new Parrot("Kesha", 0.2, 4, true, false);
        Crow crow = new Crow("Whitey", 1.1, 2, true, "white");

        Shark babyShark = new Shark("BabyShark", 5, 3, false, 300);
        Shark mommyShark = new Shark("MommyShark", 15, 13, false, 4500);

        Cow burena = new Cow("Burena", 80, 9, 4, 4);
        Cat cat = new Cat("Murka", 4.2, 3, 4, 8);
        Human vasili = new Human("Vasili", 78, 23, 2);
        Human harry = new Human("Harry", 44, 17, 2);

        String name = gosha.getName();
        String name1 = harry.getName();
        String name2 = cat.getName();

        Animal[] zoo = {
                gosha, kesha, crow,
                babyShark, mommyShark,
                burena, cat, vasili, harry
        };

        EarthAnimal[] animals = {cat, vasili, harry, burena};

        Parrot[] parrots = {gosha, kesha};

        playWithZoo(zoo);

        Cyborg cyborg = new Cyborg("T1000", 140.2);

        System.out.println();
        Humanitarian[] humanoids = {vasili, harry, cyborg};

        for (Humanitarian h : humanoids) {
            h.develop();
            h.fight();
            h.think();
            h.voice();
            h.move();
            h.toString();
        }
    }


    public static void playWithZoo(Animal[] zoo) {
        for (Animal animal : zoo) {
            if (animal.getAge() > 3) {
                animal.voice();
            } else {
                animal.move();
                if (animal instanceof EarthAnimal earthAnimal) {
                    earthAnimal.move();
                }
                animal.sleep();
            }
        }
    }
}

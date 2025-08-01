package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {

    public static void main(String[] args) {
//        Set<String> countries = new HashSet<>();
        Set<String> countries = new LinkedHashSet<>();
        countries.add("Belarus");
        countries.add("UK");
        countries.add("USA");
        countries.add("Norway");
        countries.add("France");

        System.out.println(countries);

        countries.add("Norway");
        countries.add("Sweden");
        countries.add("Denmark");
        countries.add("France");
        countries.add("Belgium");

        System.out.println(countries);
        System.out.println(countries);


        Set<Integer> ints = new TreeSet<>();
        ints.add(1);
        ints.add(5);
        ints.add(7);
        ints.add(9);
        ints.add(11);
        ints.add(5);
        ints.add(1);
        ints.add(4);
        ints.add(-5);
        ints.add(8);
        System.out.println(ints);

        Set<Time> objects = new TreeSet<>();
        objects.add(new Time(3,3));

    }
}

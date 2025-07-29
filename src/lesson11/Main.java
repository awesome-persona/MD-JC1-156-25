package lesson11;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        Queue<String> cities = new ArrayDeque<>();
//        Queue<String> cities = new PriorityQueue<>();
//        Queue<String> cities = new LinkedList<>();
//        Deque<String> cities = new ArrayDeque<>();
        Deque<String> cities = new LinkedList<>();
        System.out.println(cities);
        cities.offer("Minsk");
        cities.offer("Berlin");
        cities.offer("Oslo");
        System.out.println(cities);
        if (!cities.isEmpty()) {
            System.out.println(cities.element());
        }
        String poll = cities.poll();
        cities.offer("Moscow");
        System.out.println(cities);
        System.out.println(cities.poll());
        System.out.println(cities);
        System.out.println(cities.size());
        cities.add("Paris");
        cities.addAll(Arrays.asList("New York", "Madrid", "London"));
        System.out.println(cities);


        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.offerFirst(55);
        numbers.addFirst(66);

        numbers.add(44);
        numbers.addLast(71);
        numbers.offerLast(66);


        System.out.println(numbers);

        Stack<Integer> stack = new Stack<>();
        stack.push(666);
    }
}

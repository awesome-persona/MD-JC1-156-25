package lesson12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
//        List<Integer> objects = new ArrayList<>();
        todo(new ArrayList<>());
//        todo(new LinkedList<>());
//        todo(new Vector<>());

        check(new int[]{1,2,3});
        check2(0, 1);
        check2(1);
        check2(1,2,3,4,5,6);
        check2(1,new int[]{1,2,3});
    }

    public static void todo(List<Integer> ints) {
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.offerFirst(55);
        numbers.addFirst(66);

        numbers.add(44);
        numbers.addLast(71);
        numbers.offerLast(66);

        System.out.println(ints);
        ints.add(55);
        ints.addAll(List.of(1,2,3,4,5));
        ints.add(3, 41);
        System.out.println(ints);
        ints.addAll(2, numbers);
        System.out.println(ints);
        ints.set(7, 777);
        System.out.println(ints);

        Integer i = ints.get(5);
        System.out.println(i);

        ints.remove(8);
        ints.remove((Integer) 66);

        System.out.println(ints);
    }


    public static void check(int[] ints) {
        int[] ints1 = ints;
    }

    public static void check2(int ints0, int... ints1) {
        int[] ints = ints1;
    }
}

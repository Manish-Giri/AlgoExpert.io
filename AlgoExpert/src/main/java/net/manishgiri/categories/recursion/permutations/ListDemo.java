package net.manishgiri.categories.recursion.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListDemo {

    private static void listRemovalIncorrect() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> l3 = new ArrayList<>(l1);
        List<Integer> l2 = new ArrayList<>();
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            int removed = l3.remove(i);
            System.out.println("Removed = " + removed);
            l2.add(removed);
        }
        System.out.println("---");
        System.out.println(l1);
        System.out.println(l3);
        System.out.println(l2);
    }

    private static void listRemovalCorrect() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> l3;
        List<Integer> l2 = new ArrayList<>();
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            l3 = new ArrayList<>(l1);
            int removed = l3.remove(i);
            System.out.println("Removed = " + removed);
            l2.add(removed);
        }
        System.out.println("---");
        System.out.println(l1);
        //System.out.println(l3);
        System.out.println(l2);
    }

    public static void main(String[] args) {
        listRemovalCorrect();
    }
}

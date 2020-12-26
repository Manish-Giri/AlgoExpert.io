package net.manishgiri.categories.recursion.powersets.iterative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that takes in an array of unique
 * integers and returns its powerset.
 * The powerset P(X) of a set X is the set of all
 * subsets of X . For example, the powerset of
 * [1,2] is [[], [1], [2], [1,2]] .
 * Note that the sets in the powerset do not need
 * to be in any particular order.
 * Sample Input
 * array = [1, 2, 3]
 * Sample Output
 * Hints
 * Hint 1
 * Hint 2
 * Hint 3
 * Optimal Space & Time
 * Complexity
 * [[], [1], [2], [3], [1, 2], [1, 3], [2,3], [1,2,3]]
 */

 class Program {

     static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> sets = new ArrayList<>();
        sets.add(new ArrayList<Integer>());
         for (Integer integer : array) {
             // add this number to every powerset in sets
             int len = sets.size();
             for (int j = 0; j < len; j++) {
                 // new arraylist so as to not modify current set
                 List<Integer> curr = new ArrayList<>(sets.get(j));
                 curr.add(integer);
                 sets.add(curr);
             }
         }
        return sets;
    }
}

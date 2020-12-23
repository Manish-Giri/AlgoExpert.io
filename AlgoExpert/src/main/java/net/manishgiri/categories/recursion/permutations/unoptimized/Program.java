package net.manishgiri.categories.recursion.permutations.unoptimized;

import java.util.ArrayList;
import java.util.List;

/**
 * creating intermediate copies
 */
class Program {

    static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> perms = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        helper(array, perm, perms);
        return perms;
    }

    private static void helper(List<Integer> array, List<Integer> perm, List<List<Integer>> perms) {
        // base case - when array is empty and curr perm is not empty
        if (array.isEmpty() && !perm.isEmpty()) {
            perms.add(perm);
            return;
        }

        // recursive call for each num in array - [1,2,3]
        for (int i = 0; i < array.size(); i++) {
            // create copy of array and remove element at index i
            List<Integer> arr = new ArrayList<>(array);
            int removed = arr.remove(i);
            // add element removed to current perm built built
            List<Integer> currPerm = new ArrayList<>(perm);
            currPerm.add(removed);
            // recursive call with new array, new perm copy
            helper(arr, currPerm, perms);
        }

    }
}

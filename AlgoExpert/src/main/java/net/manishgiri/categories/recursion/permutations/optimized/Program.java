package net.manishgiri.categories.recursion.permutations.optimized;

import java.util.ArrayList;
import java.util.List;

// uses swapping to create permutations within the same array, thereby avoiding extra arrays
class Program {

    static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> perms = new ArrayList<List<Integer>>();
        helper(0, array, perms);
        return perms;
    }

    private static void helper(int index, List<Integer> array, List<List<Integer>> perms) {
        // base case - when index is at the last, add current perm
        if(index == array.size() - 1) {
            perms.add(new ArrayList<>(array));
            return;
        }

        for(int j = index; j < array.size(); j++) {
            swap(array, index, j);
            helper(index+1, array, perms);
            swap(array, index, j);
        }
    }

    private static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}

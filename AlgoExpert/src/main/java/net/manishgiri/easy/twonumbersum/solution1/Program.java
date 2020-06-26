package net.manishgiri.easy.twonumbersum.solution1;

import java.util.HashMap;

/**
 *  Write a function that takes in a non-empty array of distinct integers and an
 *   integer representing a target sum. If any two numbers in the input array sum
 *   up to the target sum, the function should return them in an array, in any
 *   order. If no two numbers sum up to the target sum, the function should return
 *   an empty array.
 *
 *   Note that the target sum has to be obtained by summing two different integers
 *   in the array; you can't add a single integer to itself in order to obtain the
 *   target sum.
 *
 *   You can assume that there will be at most one pair of numbers summing up to
 *   the target sum.
 */
class Program {

    // Time - O(n), Space - O(n)
    static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int diff = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            diff = targetSum - array[i];
            if(map.containsValue(diff)) {
                return new int[]{array[i], diff};
            }
            else {
                map.put(i, array[i]);
            }
        }
        return new int[]{};
    }
}

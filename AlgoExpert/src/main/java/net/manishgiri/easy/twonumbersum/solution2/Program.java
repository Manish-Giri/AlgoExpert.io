package net.manishgiri.easy.twonumbersum.solution2;

import java.util.HashMap;

class Program {
    // time - O(n^2), brute force
    static int[] twoNumberSum(int[] array, int targetSum) {
        int first, second;
        for (int i = 0; i < array.length - 1; i++) {
            first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                second = array[j];
                if (first + second == targetSum)
                    return new int[]{first, second};

            }

        }
        return new int[0];
    }
}

package net.manishgiri.easy.productsum.recursion;

import java.util.*;

/**
 * Write a function that takes in a "special" array and returns its product sum.
 * A "special" array is a non-empty array that contains either integers or other
 * "special" arrays. The product sum of a "special" array is the sum of its
 * elements, where "special" arrays inside it are summed themselves and then
 * multiplied by their level of depth.
 * The depth of a "special" array is how far nested it is. For instance, the
 * depth of
 * input -  = [5, 2, [7, -1], 3, [6, [-13, 8], 4]
 * output - // calculated as: 5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)
 * <p>
 * HINT 2 - Initialize the product sum of the "special" array to 0. Then, iterate through all of the array'
 * elements; if you come across a number, add it to the product sum; if you come across another "special"
 * array, recursively call the productSum function on it and add the returned value to the product sum. How
 * will you handle multiplying the product sums at a given level of depth?
 * <p>
 * Have the productSum function take in a second parameter: the multiplier, initialized to 1. Whenever you
 * recursively call the productSum function, pass in the multiplier incremented by 1.
 */
class Program {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.

    static int productSum(List<Object> array) {
        // Write your code here.
        return helper(array, 1);
    }

    private static int helper(List<Object> array, int multiplier) {
        int pSum = 0;
        for (Object obj : array) {
            if (obj instanceof ArrayList) {
                pSum += helper((List<Object>) obj, multiplier + 1);

            } else {
                pSum += ((Integer) obj).intValue();
            }
        }
        return pSum * multiplier;
    }

}

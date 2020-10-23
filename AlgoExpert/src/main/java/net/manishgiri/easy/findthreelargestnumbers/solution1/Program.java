package net.manishgiri.easy.findthreelargestnumbers.solution1;

/**
 *  Write a function that takes in an array of at least three integers and,
 *  without sorting the input array, returns a sorted array of the three largest
 *  integers in the input array
 *
 * The function should return duplicate integers if necessary; for example, it
 * should return [10, 10, 12]  for an input array of [10, 5, 9, 10, 12]
 */
class Program {

    static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] sorted = new int[3];
        int largest = Integer.MAX_VALUE, temp;
        for (int i = 2; i >= 0; i--) {
            temp = findNextLargest(array, largest);
            sorted[i] = temp;
            largest = temp;
        }
        return sorted;
    }

    private static int findNextLargest(int[] array, int largest) {
        int curr = Integer.MIN_VALUE;
        for (int n : array) {
            if (n >= curr && n < largest) {
                curr = n;
            }
        }
        return curr == Integer.MIN_VALUE ? largest : curr;
    }
}

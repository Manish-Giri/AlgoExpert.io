package net.manishgiri.easy.bubblesort.basic;

import java.util.Arrays;

class Program {
    /**
     * Traverse the input array, swapping any two numbers that are out of order and keeping track of any swaps that you
     * make. Once you arrive at the end of the array, check if you have made any swaps; if not, the array is sorted and
     * you are done; otherwise, repeat the steps laid out in this hint until the array is sorted.
     * Complexity -
     * Best: O(n) time | O(1) space - where n is the length of the input array
     * Average: O(n^2) time | O(1) space - where n is the length of the input array
     * Worst: O(n^2) time | O(1) space - where n is the length of the input array
     */
    static int[] bubbleSort(int[] array) {
        // Write your code here.
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

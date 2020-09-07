package net.manishgiri.easy.bubblesort.optimized;

// OPTIMIZED VERSION
class Program {

    // contains optimization for skipping checking of last index on every iteration
    // see solution 2 for basic version without opt
    static int[] bubbleSort(int[] array) {
        // Write your code here.
        // boolean variable to control while loop
        boolean isSorted = false;

        // counter variable - for optimization
        int counter = 0;
        int len = array.length - 1;

        // run loop till array is not sorted
        while(!isSorted) {
            // set to true to be reset later (or not)
            isSorted = true;

            for(int i = 0; i < len - counter; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }

            // increment counter to skip checking last index on next iteration
            counter++;
        }
        return array;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

package net.manishgiri.categories.searching.easy.binarysearch.iterative;

class Program {

    static int binarySearch(int[] array, int target) {
        // Write your code here.
        int low = 0, high = array.length - 1, mid;
        while (true) {
            if (high < low)
                break;

            mid = (low + high) / 2;
            if (array[mid] == target)
                return mid;
            else if (target < array[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}



package net.manishgiri.categories.searching.easy.binarysearch.recursive;

class Program {

    static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binSearchRecursive(array, 0, array.length-1, target);
    }

    private static int binSearchRecursive(int[] array, int low, int high, int target) {
        // base case
        if(high < low)
            return -1;

        // calculate mid
        int mid = (low + high)/2;
        if(array[mid] == target)
            return mid;
        else if(target < array[mid])
            return binSearchRecursive(array, low, mid-1, target);
        else
            return binSearchRecursive(array, mid+1, high, target);
    }
}

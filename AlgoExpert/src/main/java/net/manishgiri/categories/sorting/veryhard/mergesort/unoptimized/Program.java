package net.manishgiri.categories.sorting.veryhard.mergesort.unoptimized;

import java.util.Arrays;

class Program {

    static int[] mergeSort(int[] array) {
        // Write your code here.
        if (array == null || array.length == 0) return new int[]{};
        return mergeSortRec(array, 0, array.length - 1);
    }

    private static int[] mergeSortRec(int[] arr, int low, int high) {
        if (low >= high) return arr;
        int mid = low + ((high - low) / 2);
        int[] leftHalf = Arrays.copyOfRange(arr, low, mid + 1);
        int[] rightHalf = Arrays.copyOfRange(arr, mid + 1, high + 1);
        int[] leftDivided = mergeSortRec(leftHalf, 0, leftHalf.length-1);
        int[] rightDivided = mergeSortRec(rightHalf, 0, rightHalf.length-1);
        return merge(leftDivided, rightDivided);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) merged[k++] = left[i++];
        while (j < right.length) merged[k++] = right[j++];
        return merged;
    }
}

package net.manishgiri.easy.validatesubsequence.solution1;

import java.util.List;

/**
 * Given two non-empty arrays of integers, write a function that determines
 *  whether the second array is a subsequence of the first one.
 *
 * A subsequence of an array is a set of numbers that aren't necessarily adjacent
 * in the array but that are in the same order as they appear in the array. For
 * instance, the numbers <span>[1, 3, 4]</span> form a subsequence of the array
 * <span>[1, 2, 3, 4]</span>, and so do the numbers <span>[2, 4]</span>
 *
 *  Note that a single number in an array and the array itself are both valid
 *  subsequences of the array.
 *
 *  ex - [5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10] => true
 */
class Program {

    // Time - O(n) - loops through 'array' once, with constant work in each iteration
    // Space - O(1)
    static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0, seqIdx = 0;
        while(arrIdx < array.size() && seqIdx < sequence.size()) {
            if(array.get(arrIdx).equals(sequence.get(seqIdx)))
                seqIdx++;
            arrIdx++;
        }
        // outside loop, subsequence is valid only if all items in subsequence
        // have been reached
        return seqIdx == sequence.size();

    }
}

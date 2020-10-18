package net.manishgiri.categories.recursion.permutations;

import java.util.ArrayList;
import java.util.List;

class BuggyProgram {

    private static void generatePermutations(int[] array, List<Integer> perm, List<List<Integer>> perms) {
        if(array.length == 0) {
            perms.add(perm);
            return;
        }
        for(int num: array) {

            int[] remNums = remArray(array, num);
            perm.add(num);
            generatePermutations(remNums, perm, perms);

        }
    }

    private static int[] remArray(int[] arr, int num) {
        int[] newArr = new int[arr.length-1];
        int i = 0;
        for(int n: arr) {
            if(n != num) {
                newArr[i++] = n;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1,2,3};
        List<List<Integer>> perms = new ArrayList<>();
        List<Integer> currPerm = new ArrayList<>();
        generatePermutations(arr, currPerm, perms);
        perms.forEach(System.out::println);

    }
}

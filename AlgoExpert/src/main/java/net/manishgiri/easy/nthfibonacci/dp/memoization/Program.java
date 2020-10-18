package net.manishgiri.easy.nthfibonacci.dp.memoization;

import java.util.Arrays;

// RECURSION WITH MEMOIZATION - TIME - O(N) | SPACE - O(N)
 class Program {

     static int getNthFib(int n) {
        // Write your code here.
        int[] fibs = new int[n];
        if(n == 2 || n == 1)
            return n-1;
        Arrays.fill(fibs, -1);
        fibs[0] = 0; fibs[1] = 1;
        return fib(n-1, fibs);
    }


    private static int fib(int n, int[] arr) {
        // if fib(n) has not been computed already
        if (arr[n] == -1) {
            // compute value and store it, then return it
            arr[n] = fib(n-1, arr) + fib(n-2, arr);
        }
        // else return computed value
        return arr[n];
    }
}

/*
 private static int fib(int n, int[] arr) {
 	// fib(n) has been computed already
 	if(arr[n] != -1)
 		return arr[n];
 	else {
 		// compute value and store it, then return it
 		arr[n] = fib(n-1, arr) + fib(n-2, arr);
 		return arr[n];
 	}
 }

 	private static int fib(int n, int[] arr) {
 		if(n == 0 || n == 1)
 			return arr[n];
 		else {
 			if(arr[n-1] == -1)
 				arr[n-1] = fib(n-1, arr);
 			if(arr[n-2] == -1)
 				arr[n-2] = fib(n-2, arr);
 			return arr[n-1] + arr[n-2];
 		}
 	}
 */
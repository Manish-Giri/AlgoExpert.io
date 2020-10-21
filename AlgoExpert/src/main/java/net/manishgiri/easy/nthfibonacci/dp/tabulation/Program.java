package net.manishgiri.easy.nthfibonacci.dp.tabulation;

/**
 * BOTTOM UP DP (Tabulation), ITERATION
 * Time - O(n) | Space - O(1)
 */
class Program {
    static int getNthFib(int n) {
        // Write your code here.
        int[] fib = {0, 1};
        if (n < 3) return fib[n - 1];
        for (int i = 2; i < n; i++) {
            int curr = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = curr;
        }

        return fib[1];
    }
}

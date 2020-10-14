package net.manishgiri.easy.nthfibonacci.unoptimized;

class Program {

    // TIME - O(2^n)
    static int getNthFib(int n) {
        // Write your code here.
        if (n == 2 || n == 1)
            return n - 1;
        return getNthFib(n - 1) + getNthFib(n - 2);
    }
}

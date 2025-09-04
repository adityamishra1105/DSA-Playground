package DynamicProgramming;

import java.util.Arrays;

public class Fibo_Memoization {
    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) return n;

        if (memo[n] != -1) return memo[n];

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n, memo));
    }
}

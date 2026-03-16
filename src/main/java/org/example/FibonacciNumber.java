package org.example;

public class FibonacciNumber {

    private FibonacciNumber() {

    }

    //Time Complexity: O(n), Space Complexity: O(1)
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    //Time Complexity: O(2ⁿ), Space Complexity: O(n)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    //Time Complexity: O(n), Space Complexity: O(n)
    public static int fibonacciDP(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

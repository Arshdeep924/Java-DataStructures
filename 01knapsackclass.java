public class 01knapsack {
    public static int knapsack(int[] weights, int[] profits, int capacity) {
        int n = weights.length;
        int[] dp = new int[capacity+1];

        for(int i = 0; i < n; i++) {
            for(int w = capacity; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], profits[i] + dp[w])
            }
        }
    }
}
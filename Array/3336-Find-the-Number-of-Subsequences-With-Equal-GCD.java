// 3336. Find the Number of Subsequences With Equal GCD (Hard)
// https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/

class Solution {
    public int subsequencePairCount(int[] nums) {
        int n = nums.length;
        int MOD = 1_000_000_007;
        
        // dp[i][g1][g2] stores the number of ways to have two disjoint subsequences
        // with GCDs g1 and g2 using a subset of the first i elements.
        // We optimize space by only keeping the current and previous states.
        // Using a 2D array where dp[g1][g2] is the number of ways.
        int[][] dp = new int[201][201];
        
        // Base case: 0 represents "empty" subsequence (GCD not yet defined).
        dp[0][0] = 1;
        
        for (int x : nums) {
            int[][] nextDp = new int[201][201];
            for (int g1 = 0; g1 <= 200; g1++) {
                for (int g2 = 0; g2 <= 200; g2++) {
                    if (dp[g1][g2] == 0) continue;
                    
                    long currentWays = dp[g1][g2];
                    
                  
                    nextDp[g1][g2] = (int)((nextDp[g1][g2] + currentWays) % MOD);
                    
                    
                    int nextG1 = (g1 == 0) ? x : gcd(g1, x);
                    nextDp[nextG1][g2] = (int)((nextDp[nextG1][g2] + currentWays) % MOD);
                    
                    int nextG2 = (g2 == 0) ? x : gcd(g2, x);
                    nextDp[g1][nextG2] = (int)((nextDp[g1][nextG2] + currentWays) % MOD);
                }
            }
            dp = nextDp;
        }
        
        long ans = 0;
        
        for (int g = 1; g <= 200; g++) {
            ans = (ans + dp[g][g]) % MOD;
        }
        
        return (int)ans;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
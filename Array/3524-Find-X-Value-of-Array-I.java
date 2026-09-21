// 3524. Find X Value of Array I (Medium)
// https://leetcode.com/problems/find-x-value-of-array-i/

class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        
        // dp[r] keeps track of the count of subarrays ending at the previous index with product modulo k == r
        long[] dp = new long[k];
        
        for (int num : nums) {
            long[] nextDp = new long[k];
            
            // A new subarray starting at the current element
            int startRem = num % k;
            nextDp[startRem]++;
            
            // Extend all previous subarrays ending at the last index
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int newRem = (int)((long)r * (num % k) % k);
                    nextDp[newRem] += dp[r];
                }
            }
            
            dp = nextDp;
            
            // Add all subarrays ending at the current index to the total result
            for (int r = 0; r < k; r++) {
                result[r] += dp[r];
            }
        }
        
        return result;
    }
}
// 3867. Sum of GCD of Formed Pairs (Medium)
// https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        
        // Step 1: Construct prefixGcd array
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(nums[i], mx);
        }
        
        // Step 2: Sort the array
        Arrays.sort(prefixGcd);
        
        // Step 3: Pair smallest and largest elements and calculate sum of GCDs
        long sum = 0;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        
        return sum;
    }
    
    // Helper function to compute GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
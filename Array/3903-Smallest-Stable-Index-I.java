// 3903. Smallest Stable Index I (Easy)
// https://leetcode.com/problems/smallest-stable-index-i/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        int i = 0;
        while (i < n) {
            int min = nums[i];   
            int ans = 0;
            if (nums[i] > max) {
                max = nums[i];
            }
            for (int j = i; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                }
                ans = max - min;
            }
            if (ans <= k) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
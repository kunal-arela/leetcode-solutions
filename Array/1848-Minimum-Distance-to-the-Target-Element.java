// 1848. Minimum Distance to the Target Element (Easy)
// https://leetcode.com/problems/minimum-distance-to-the-target-element/

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = Math.min(ans, Math.abs(i - start));
            }
        }
        return ans;
    }
}
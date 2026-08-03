// 643. Maximum Average Subarray I (Easy)
// https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double Max = 0;
        double sum = 0;
        for(int i = 0;i<k;i++){
            sum += nums[i];
           double avg = sum/k;
            Max = Math.max(Max  , avg );
             sum -= nums[i];

        }
        return Max;
    }
}
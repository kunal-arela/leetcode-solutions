// 643. Maximum Average Subarray I (Easy)
// https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n = nums.length;
       double sum = 0;
       for(int i = 0;i<k;i++){
        sum += nums[i];
       }
       double Max = sum;
       for(int i = k;i<n;i++){
        sum += nums[i];
        sum -= nums[i - k];
        Max = Math.max(sum , Max);
       }
       double avg = Max/k;
       return avg;
    }
}
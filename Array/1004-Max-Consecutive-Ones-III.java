// 1004. Max Consecutive Ones III (Medium)
// https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int zero = 0;
        int max = 0;
        for(int right = 0;right<n;right++){
            if(nums[right] == 0){
               zero++;
            }while(zero > k){
               if (nums[left] == 0) {
               zero--;
             }
                left++;
            }
            int len = right - left + 1;
              max = Math.max(len , max);
        }
        return max;
    }
}
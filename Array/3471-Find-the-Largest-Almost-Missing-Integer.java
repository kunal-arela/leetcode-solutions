// 3471. Find the Largest Almost Missing Integer (Easy)
// https://leetcode.com/problems/find-the-largest-almost-missing-integer/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
}
// 268. Missing Number (Easy)
// https://leetcode.com/problems/missing-number/

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
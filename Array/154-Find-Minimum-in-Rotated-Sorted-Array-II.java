// 154. Find Minimum in Rotated Sorted Array II (Hard)
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        for(int i = 0;i<n;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;

    }
}
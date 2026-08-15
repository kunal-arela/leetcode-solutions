// 26. Remove Duplicates from Sorted Array (Easy)
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int k = 0;
        for(int i = 0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
             arr[i] = nums[i];
             k++;
            }
        }
        return k+1;
    }
}
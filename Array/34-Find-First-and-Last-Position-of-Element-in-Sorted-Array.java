// 34. Find First and Last Position of Element in Sorted Array (Medium)
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int [] arr = {- 1 , -1};
        for(int i = 0;i<n;i++){
            for(int j = n - 1;j>=0;j--){
            if(nums[i] == target || nums[j] == target){
                arr[0] = i;
                arr[1] = j;
                break;
            }
        }
        }
       return arr;
    }
}
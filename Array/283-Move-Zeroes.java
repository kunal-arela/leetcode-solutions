// 283. Move Zeroes (Easy)
// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int [] arr =  new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                arr[i] = nums[i];
            }else{
                arr[n - 1] = 0;
            }
        }
        for(int i = 0;i<n;i++){
            nums[i] = arr[i];
        }
    }
}
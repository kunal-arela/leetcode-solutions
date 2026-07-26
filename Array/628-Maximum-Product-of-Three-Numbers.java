// 628. Maximum Product of Three Numbers (Easy)
// https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Math.abs(nums[i]);
        }

          return arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];

    }
}
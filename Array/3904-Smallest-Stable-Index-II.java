// 3904. Smallest Stable Index II (Medium)
// https://leetcode.com/problems/smallest-stable-index-ii/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
      int n = nums.length;
      int [] arr = nums.clone();
     
      for(int i = n - 2;i>=0;i--){
        arr[i] = Math.min(arr[i] , arr[i+1]);
      }
       int max = nums[0];
       for(int i = 0;i<n;i++){
        if(nums[i] > max){
            max = nums[i];
        }
        int dif = max - arr[i];
        if(dif <= k){
            return i;
        }
       }
       return -1;
        }
}
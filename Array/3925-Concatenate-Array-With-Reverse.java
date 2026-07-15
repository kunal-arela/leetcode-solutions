// 3925. Concatenate Array With Reverse (Easy)
// https://leetcode.com/problems/concatenate-array-with-reverse/

class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int [] arr = new int[2*n];
        for(int i = 0;i<n;i++){
            arr[i] = nums[i];
            arr[ i + n] = nums[ n - 1 - i];
        }
        return arr;
    }
}
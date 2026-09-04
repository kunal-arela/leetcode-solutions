// 3978. Unique Middle Element (Easy)
// https://leetcode.com/problems/unique-middle-element/

class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = nums[n/2];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(mid == nums[i]){
                count++;
            }
        }if(count == 1){
            return true;
        }
        return false;
    }
}
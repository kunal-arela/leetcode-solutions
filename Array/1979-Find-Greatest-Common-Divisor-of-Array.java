// 1979. Find Greatest Common Divisor of Array (Easy)
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        for(int i = nums[0];i>0;i--){
            if(nums[0] % i == 0 && nums[n - 1] % i == 0){
               ans = i;
               break;
            }
          
        }
        return ans;
    }
}
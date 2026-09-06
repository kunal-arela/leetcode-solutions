// 260. Single Number III (Medium)
// https://leetcode.com/problems/single-number-iii/

class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        int index = 0;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(nums[i] == nums[j]){
                 count++;
                }
            }
             if(count == 1){
            result[index] = nums[i];
            index++;
        }if(index == 2){
            break;
        }
        }
      return result; 

    }
}